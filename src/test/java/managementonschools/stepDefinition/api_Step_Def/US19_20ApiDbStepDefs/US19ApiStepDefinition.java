package managementonschools.stepDefinition.api_Step_Def.US19_20ApiDbStepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import managementonschools.pojos.us_19_20.US19Pojo.US19PostPojo;
import managementonschools.pojos.us_19_20.US19Pojo.US19ResponsePojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static org.junit.Assert.assertEquals;


public class US19ApiStepDefinition {
    Response response;
    US19PostPojo expectedData;
    static US19ResponsePojo actualData;

    static Faker faker = new Faker();

    static String date = faker.number().numberBetween(2023, 2025) + "-" + faker.number().numberBetween(10, 12) + "-" + faker.number().numberBetween(10 , 30);
    static String description = "Toplanti"+faker.number().numberBetween(1,50);
     static String startTime=faker.number().numberBetween(10,11)+":"+faker.number().numberBetween(10,50);
     static String stopTime=faker.number().numberBetween(12,13)+":"+faker.number().numberBetween(10,50);
     static List<Integer> studentId;


    @Given("kullaniciUS19_TC01 set the url")
    public void kullaniciUS19_TC01_set_the_url() {
        spec.pathParams("first", "meet", "second", "save");
    }

    @When("kullaniciUS19_TC01 send post request")
    public void kullaniciUS19_TC01_send_post_request() {

        //RestAssured.defaultParser = Parser.JSON;

       US19PostPojo studentId = new US19PostPojo();

       studentId.setStudentIds(new ArrayList<>());
       studentId.getStudentIds().add(473);


        expectedData = new US19PostPojo(date, description, startTime, stopTime, studentId.getStudentIds());

        response = given(spec).when().body(expectedData).post("{first}/{second}");
        response.prettyPrint();

          /*
    {
  "date": "2023-10-11",
  "description": "ÖnemliSS",
  "startTime": "10:00",
  "stopTime": "12:00",
  "studentIds": [
    473
      ]
}
     */

    }

    @Then("Status code should be {int} olmalı")
    public void status_code_should_be_olmalı(Integer int1) {
        actualData = response.as(US19ResponsePojo.class);
        assertEquals(200, response.statusCode());


    }

    @Then("kullaniciUS19_TC01 validate response body")
    public void kullaniciUS19_TC01_validate_response_body() {
        String message = "Meet Saved Successfully";
        String httpStatus = "CREATED";

        assertEquals(expectedData.getDate(), actualData.getObject().getDate());
        assertEquals(expectedData.getDescription(), actualData.getObject().getDescription());
        assertEquals(actualData.getMessage(), message);
        assertEquals(actualData.getHttpStatus(), httpStatus);

        // assertEquals(expectedData.getStartTime(),actualData.getObject().getStartTime());
        // assertEquals(expectedData.getStopTime(),actualData.getObject().getStopTime());
        // assertEquals(expectedData.getStudentIds(),actualData.getObject().getStudents().get(0).toString());

    }


}
