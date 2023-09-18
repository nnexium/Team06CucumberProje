package managementonschools.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import managementonschools.pojos.us_03_04.DeanPostPojo;
import managementonschools.pojos.us_03_04.ResponsePojo;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static org.junit.Assert.assertEquals;

public class apiStepDef {

    DeanPostPojo expectedData;
    Response response;
    ResponsePojo actualData;


    @Given("Dean eklemek icin Post request hazirligi yapilir")
    public void dean_eklemek_icin_post_request_hazirligi_yapilir() {
        // Set the URL
        spec.pathParams("first", "dean", "second", "save");
    }
    @Given("Gonderilecek dean bilgileri hazirlanir")
    public void gonderilecek_dean_bilgileri_hazirlanir() {
        // Set the expected data
        expectedData = new DeanPostPojo("1984-08-05", "San Diego", "MALE", "Dean", "Team0612", "538-528-3284", "538-52-3284", "Team", "DeanTeam0606");
    }
    @When("Dean eklemek icin Post request gonderilir")
    public void dean_eklemek_icin_post_request_gonderilir() {
        // Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo.class);

    }
    @Then("Dean bilgileri dogrulanir")
    public void dean_bilgileri_dogrulanir() {
        // Do assertion
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());

    }
}



