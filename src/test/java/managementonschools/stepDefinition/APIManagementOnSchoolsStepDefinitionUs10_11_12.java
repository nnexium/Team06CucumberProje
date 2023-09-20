package managementonschools.stepDefinition;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import managementonschools.pojos.us_10_11_12.US10Pojo.US10PostPojo;
import managementonschools.pojos.us_10_11_12.US10Pojo.US10ResponsePojo;
import managementonschools.pojos.us_10_11_12.US12Pojo.US12PostPojo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class APIManagementOnSchoolsStepDefinitionUs10_11_12 {

    Faker faker = new Faker();
    US10PostPojo expectedData;
    Response response;
    US10ResponsePojo actualData;
    US12PostPojo expectedData2;

    String currentDay = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    LocalDateTime time = LocalDateTime.now();
    String timeHour = Integer.toString(time.getHour());
    int timeMinute = time.getMinute();
    String timeMinuteStr = Integer.toString(timeMinute);
    String timeMinutePlus = Integer.toString(timeMinute + 1);

    int lessonProgramId;

    @Given("Ders eklemek icin Post request hazirligi yapilir")
    public void dersEklemekIcinPostRequestHazirligiYapilir() {
        //set the URL
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @And("Gonderilicek bilgiler hazirlanir")
    public void gonderilicekBilgilerHazirlanir() {
        if (timeMinute<=9){
            if (timeMinute==9){
                timeMinuteStr = "0"+timeMinuteStr;
            }else {
                timeMinuteStr = "0"+timeMinuteStr;
                timeMinutePlus = "0"+timeMinutePlus;
            }
        }
        System.out.println(timeHour + ":" + timeMinuteStr);
        expectedData = new US10PostPojo(currentDay, 1, Collections.singletonList(1), timeHour + ":" + timeMinuteStr, timeHour + ":" + timeMinutePlus);
    }

    @When("Ders programi eklemek icin Post request gonderilir")
    public void dersEklemekIcinPostRequestGonderilir() {
        //send the request and get the response
        RestAssured.defaultParser = Parser.JSON;
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        //actualData = response.as(US10ResponsePojo.class);

        String jsonResponse = response.prettyPrint();  // Your JSON response here
        response.prettyPrint();
        ObjectMapper mapper = new ObjectMapper();
        try {
            actualData = mapper.readValue(jsonResponse, US10ResponsePojo.class);
            // Now you can use 'data' as an instance of YourDataClass
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("Ders bilgileri onaylanir")
    public void dersBilgileriOnaylanir() {
        assertEquals(currentDay, actualData.getObject().getDay());
        assert (actualData.getObject().getLessonName().contains("English"));
        assertEquals(timeHour + ":" + timeMinuteStr + ":00", actualData.getObject().getStartTime());
        assertEquals(timeHour + ":" + timeMinutePlus + ":00", actualData.getObject().getStopTime());

        lessonProgramId = actualData.getObject().getLessonProgramId();
        System.out.println(lessonProgramId);
    }

    @Then("Onceden olusturulmus ders programi silinir ve silindigi kontrol edilir")
    public void oncedenOlusturulmusDersProgramiSilinir() {
        lessonProgramId = actualData.getObject().getLessonProgramId();
        System.out.println(lessonProgramId);
        spec.pathParams("first", "lessonPrograms", "second", "delete", "third", lessonProgramId);
        given(spec).when().delete("{first}/{second}/{third}");

        spec.pathParams("first", "lessonPrograms", "second", "getById", "third", lessonProgramId);
        given(spec).when().get("{first}/{second}/{third}").prettyPrint();
    }

    @Given("Onceden olusturulmus dersler ile onceden olusturulmus ogretmene ders atamasi yapilir")
    public void oncedenOlusturulmusDerslerIleOncedenOlusturulmusOgretmeneDersAtamasiYapilir() {

        lessonProgramId = actualData.getObject().getLessonProgramId();

        String lessonProgramIdStr = Integer.toString(lessonProgramId);
        List<String> list = new ArrayList<>();
        list.add(lessonProgramIdStr);
        expectedData2 = new US12PostPojo(list,"1");



        spec.pathParams("first", "teachers", "second", "chooseLesson");
        given(spec).body(expectedData2).when().post("{first}/{second}").prettyPrint();

        System.out.println(lessonProgramId);
    }
}
