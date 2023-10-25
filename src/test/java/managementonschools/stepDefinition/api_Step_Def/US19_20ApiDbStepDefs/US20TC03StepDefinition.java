package managementonschools.stepDefinition.api_Step_Def.US19_20ApiDbStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import managementonschools.pojos.us_19_20.US19Pojo.US19ResponsePojo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class US20TC03StepDefinition {

    Response response;
    US19ResponsePojo actualData;


    @Given("kullaniciUS20_TC03 set the url")
    public void kullanicius20_TC03SetTheUrl() {

        spec.pathParams("first","meet","second","delete","third", actualData.getObject().getId());

    }

    @When("kullaniciUS20_TC03 sends delete request and gets the response")
    public void kullanicius20_TC03SendsDeleteRequestAndGetsTheResponse() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }
     @Then("kullaniciUS20_TC03 Status code should be {int} olmalı")
     public void kullanicius20_TC03StatusCodeShouldBeOlmalı(int arg0) {

         assertEquals(200,response.statusCode());

     }

    @Then("kullaniciUS20_TC03 validate response body")
    public void kullanicius20_TC03ValidateResponseBody() {
        Map<String , Object> actualData = response.as(HashMap.class);

        assertEquals("Meet deleted successfully",actualData.get("message"));
        assertEquals("OK",actualData.get("httpStatus"));
    }
}
