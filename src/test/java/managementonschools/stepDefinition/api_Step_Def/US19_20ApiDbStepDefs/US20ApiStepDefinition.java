package managementonschools.stepDefinition.api_Step_Def.US19_20ApiDbStepDefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import managementonschools.pojos.us_19_20.US20Pojo.US20ResponsePojo;
import managementonschools.pojos.us_19_20.US20UpdatePojo.US20UpdateResponsePojo;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static managementonschools.base_urls.BaseUrl.spec;
import static managementonschools.stepDefinition.US19_20ApiDbStepDefs.US19ApiStepDefinition.actualData;

public class US20ApiStepDefinition {

    /*
   {
    "object": {
        "id": 718,
        "description": "ÖnemliSS",
        "date": "2023-11-11",
        "startTime": "10:00:00",
        "stopTime": "12:00:00",
        "advisorTeacherId": 40,
        "teacherName": "TeacherTeam06",
        "teacherSsn": "333-33-3339",
        "students": [
            {
                "id": 473,
                "username": "keiko.bednar",
                "ssn": "319-14-4957",
                "name": "Ali",
                "surname": "Dag",
                "birthDay": "1969-02-02",
                "birthPlace": "Koln",
                "phoneNumber": "392-673-2102",
                "gender": "MALE",
                "motherName": "ayse",
                "fatherName": "mehmet",
                "studentNumber": 1466,
                "email": "student@vmail.com",
                "active": true
            }
        ]
    },
    "message": "Meet Saved Successfully",
    "httpStatus": "CREATED"
}
     */

    HashMap<String,Object> expectedData;
    Response response;
    US20ResponsePojo actualData2;
    String startTime=US19ApiStepDefinition.startTime+":00";
    String stopTime=US19ApiStepDefinition.stopTime+":00";



    //TC02 Uptade
    US20UpdateResponsePojo actualUptadeData;






    @Given("kullaniciUS20_TC01 set the url")
    public void kullanici_us20_tc01_set_the_url() {


        spec.pathParams("first","meet","second","getMeetById","third", actualData.getObject().getId());

         response=given().spec(spec).when().get("{first}/{second}/{third}");
         response.prettyPrint();

        String jsonResponse = response.prettyPrint();  // Your JSON response here
        response.prettyPrint();
        ObjectMapper mapper = new ObjectMapper();
        try {
            actualData2 = mapper.readValue(jsonResponse, US20ResponsePojo.class);
            // Now you can use 'data' as an instance of YourDataClass
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @When("kullaniciUS20_TC01 sends post request and gets the response")
    public void kullanicius_TCSendsPostRequestAndGetsTheResponse() {
        expectedData= new HashMap<>();
        expectedData.put("description", US19ApiStepDefinition.description);
        expectedData.put("date", US19ApiStepDefinition.date);
        expectedData.put("startTime", startTime);
        expectedData.put("stopTime",stopTime);

    }



    @Then("kullaniciUS20_TC01 Status code should be {int} olmalı")
    public void kullanici_us20_tc01_status_code_should_be_olmalı(Integer int1) {

        Assert.assertEquals(200,response.statusCode());

    }
    @Then("kullaniciUS20_TC01 validate response body")
    public void kullanici_us20_tc01_validate_response_body() {
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(expectedData.get("description"), jsonPath.getString("object.description"));
        Assert.assertEquals(expectedData.get("date"), jsonPath.getString("object.date"));
        Assert.assertEquals(expectedData.get("startTime"), jsonPath.getString("object.startTime"));
        Assert.assertEquals(expectedData.get("stopTime"), jsonPath.getString("object.stopTime"));


    }






  /*  //TC02


    @Given("kullaniciUS20_TC02 set the url")
    public void kullanicius20_TC02SetTheUrl() {


*//*

  {
  "date": "2025-10-02",
  "description": "OnemliUptade",
  "startTime": "12:00",
  "stopTime": "16:00",
  "studentIds": [
        89
  ]
}
         *//*

        spec.pathParams("first","meet","second","update","third",682);

    }

    @When("kullaniciUS20_TC02 sends put request and gets the response")
    public void kullanicius20_TC02SendsPostRequestAndGetsTheResponse() {
         studentId = new MeetUptadepojo();

        studentId.setStudentIds(new ArrayList<>());
        studentId.getStudentIds().add("89");

        updatedBody= new MeetUptadepojo("2041-10-02","OnemliUptade","12:00","16:00",  studentId.getStudentIds()  );


        response=given(spec).body(updatedBody).when().put("{first}/{second}/{third}");
        response.prettyPrint();



    }

    @Then("kullaniciUS20_TC02 Status code should be {int} olmalı")
    public void kullanicius20_TC02StatusCodeShouldBeOlmalı(int status) {


        Assert.assertEquals(200,response.statusCode());

    }

    @Then("kullaniciUS20_TC02 validate response body")
    public void kullanicius20_TC02ValidateResponseBody() {

        actualUptadeData= response.as(MeetResponsePojo.class);

        Assert.assertEquals(updatedBody.getDate(), actualUptadeData.getObject().getDate());
        Assert.assertEquals(updatedBody.getDescription(), actualUptadeData.getObject().getDescription());
        Assert.assertEquals(updatedBody.getStartTime(), actualUptadeData.getObject().getStartTime());
        Assert.assertEquals(updatedBody.getStopTime(), actualUptadeData.getObject().getStopTime());
        //Assert.assertEquals(updatedBody.getStudentIds(), actualUptadeData.getObject().getStudents().get(0).getId());
        Assert.assertEquals("Meet Updated Successfully", actualUptadeData.getMessage());


*/

/*

  {
  "date": "2025-10-02",
  "description": "OnemliUptade",
  "startTime": "12:00",
  "stopTime": "16:00",
  "studentIds": [
        89
  ]
}
         *//*

    }


    //TC03
    @Given("kullaniciUS20_TC03 set the url")
    public void kullanicius20_TC01SetTheUrl() {
        spec.pathParams("first","meet","second","update","third",682);

    }

    @When("kullaniciUS20_TC03 sends delete request and gets the response")
    public void kullanicius20_TC03SendsDeleteRequestAndGetsTheResponse() {
        response = given(spec).when().delete("{first}/{second}/{third}");
            response.prettyPrint();

    }

    @Then("kullaniciUS20_TC03 Status code should be {int} olmalı")
    public void kullanicius20_TC03StatusCodeShouldBeOlmalı(int arg2) {
        Assert.assertEquals(200, response.statusCode());

    }

    @Then("kullaniciUS20_TC03 validate response body")
    public void kullanicius20_TC03ValidateResponseBody() {


    }


*/

    }

