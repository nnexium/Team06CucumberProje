package managementonschools.stepDefinition.api_Step_Def;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import managementonschools.base_urls.BaseUrl;
import managementonschools.pojos.us_15_16_25.MessagePojo;
import managementonschools.pojos.us_15_16_25.ResponseMessagePojoMessage;
import managementonschools.pojos.us_15_16_25.ResponsePojo;
import managementonschools.pojos.us_15_16_25.StudentPostPojo;
import managementonschools.utilities.Driver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class US15_16_25StepDef extends BaseUrl {

    StudentPostPojo expectedData;
    Response response;
    ResponsePojo actualData;

    Faker faker = new Faker();
    String phone=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999);
    String ssn=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999);
    String name = faker.name().firstName();
    String fatherName = faker.name().firstName();
    String motherName = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = (faker.name().username()+"team06").substring(0,10);
    String email = faker.name().username() + "@gmail.com";
    String password = faker.internet().password(9,10,true,true,true);
    String birthPlace = faker.nation().capitalCity();
    String birthDay = "1980-01-01";

    @Given("Student eklemek icin post request hazirligi yapilir")
    public void studentEklemekIcinPostRequestHazirligiYapilir() {
        // 1- Set the URL   --> https://managementonschools.com/app/students/save
        setUpViceDean();
        specViceDean.pathParams("first","students","second","save");
    }

    @And("ogrenci bilgileri girilir")
    public void ogrenciBilgileriGirilir() {
        //Integer advisorTeacherId = faker.number().numberBetween(10,99);
        expectedData = new StudentPostPojo(18,birthDay,birthPlace,email,fatherName,"FEMALE",motherName,name,password,phone,ssn,surname,username);
    }

    @When("Student eklemek icin post request gonderilir")
    public void studentEklemekIcinPostRequestGonderilir() {
        // 3- Send the request and get the response
        response = given(specViceDean).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);
    }

    @Then("Student bilgileri dogrulanir")
    public void studentBilgileriDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getAdvisorTeacherId(),actualData.getObject().getAdvisorTeacherId());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getEmail(),actualData.getObject().getEmail());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());
    }
    // US15---TC01 sonu


    @Given("Mesaji goruntuleyebilmek icin get request hazirliklari yapilir")
    public void mesajiGoruntuleyebilmekIcinGetRequestHazirliklariYapilir() {
        //set the url
        setUpViceDean();
        specViceDean.pathParams("first","contactMessages","second","getAll").queryParams("page",0, "size", 10, "sort", "date", "type", "desc");

    }


    @When("mesaji goruntuleyebilmek icin get request yapilir")
    public void mesajiGoruntuleyebilmekIcinGetRequestYapilir() {
        //Send the request and get the response
        response = given(specViceDean).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("message, name, email, date, subject bilgilerinin goruntulendigi dogrulanir")
    public void messageNameEmailDateSubjectBilgilerininGoruntulendigiDogrulanir() {
        //Do Assertion
        assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();


        String actualMessage = jsonPath.getList("content.findAll{it.message}.message").get(0).toString();
        String actualName = jsonPath.getList("content.findAll{it.name}.name").get(0).toString();
        String actualEmail = jsonPath.getList("content.findAll{it.email}.email").get(0).toString();
        String actualDate = jsonPath.getList("content.findAll{it.date}.date").get(0).toString();
        String actualSubject = jsonPath.getList("content.findAll{it.subject}.subject").get(0).toString();

        assertFalse(actualMessage.isEmpty());
        assertFalse(actualName.isEmpty());
        assertFalse(actualEmail.isEmpty());
        assertFalse(actualDate.isEmpty());
        assertFalse(actualSubject.isEmpty());
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Given("Student eklemek icin post request hazirligi yapilir Admin")
    public void studentEklemekIcinPostRequestHazirligiYapilirAdmin() {
        setUpAdmin();
        specAdmin.pathParams("first","students","second","save");
    }

    @And("ogrenci bilgileri girilir Admin")
    public void ogrenciBilgileriGirilirAdmin() {
        expectedData = new StudentPostPojo(18,birthDay,birthPlace,email,fatherName,"FEMALE",motherName,name,password,phone,ssn,surname,username);
    }

    @When("Student eklemek icin post request gonderilir Admin")
    public void studentEklemekIcinPostRequestGonderilirAdmin() {
        response = given(specAdmin).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);
    }

    @Then("Student bilgileri dogrulanir Admin")
    public void studentBilgileriDogrulanirAdmin() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getAdvisorTeacherId(),actualData.getObject().getAdvisorTeacherId());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getEmail(),actualData.getObject().getEmail());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());
    }

}



