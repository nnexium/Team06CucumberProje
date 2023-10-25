package managementonschools.stepDefinition.api_Step_Def.US19_20ApiDbStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class US20TC02StepDefinition {

    Response response;
    Map<String, Object> meetingData;

    @Given("kullaniciUS20_TC02 set the url")
    public void kullaniciUS20_TC02_set_the_url() {


        //spec.pathParams("first","meet","second","uptade","third",901);
        spec.pathParams("first", "meet", "second", "update", "third", 922);

    }
    @When("kullaniciUS20_TC02 sends put request and gets the response")
    public void kullaniciUS20_TC02_send_post_request() {

         meetingData = new HashMap<>();
        meetingData.put("date", "2023-11-30");
        meetingData.put("description", "Toplanti1");
        meetingData.put("startTime", "15:00");
        meetingData.put("stopTime", "18:00");

        List<String> studentIds = new ArrayList<>();
        studentIds.add("2");

        meetingData.put("studentIds", studentIds);

        Response response = given(spec).when().body(meetingData).put("{first}/{second}/{third}");
        response.prettyPrint();


        /*
        {
  "date": "2025-11-11",
  "description": "OnemliUptade",
  "startTime": "10:00",
  "stopTime": "12:00",
  "studentIds": [
        473
  ]
}
         */


    }

     @Then("kullaniciUS20_TC02 Status code should be 200 olmalı")
     public void status_code_should_be_olmalı() {

         assertEquals(200,response.statusCode());

   }

    @Then("kullaniciUS20_TC02 validate response body")
    public void kullaniciUS20_TC02_validate_response_body() {

        Map<String ,Object> actualData =  response.as(HashMap.class);

        assertEquals(meetingData.get("date"), ((Map)actualData.get("object")).get("date"));
        assertEquals(meetingData.get("description"), ((Map)actualData.get("object")).get("description"));
        assertEquals(meetingData.get("startTime"), ((Map)actualData.get("object")).get("startTime"));
        assertEquals(meetingData.get("stopTime"), ((Map)actualData.get("object")).get("stopTime"));


    }
}
