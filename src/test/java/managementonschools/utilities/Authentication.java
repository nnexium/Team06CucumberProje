package managementonschools.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static String generateTokenAdmin(){
        String body = "{\n" +
                "  \"password\": \"Team06Admin\",\n" +
                "  \"username\": \"Team06Admin\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenDean(){
        String body = "{\n" +
                "  \"password\": \"Team0612\",\n" +
                "  \"username\": \"DeanTeam06\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenViceDean(){
        String body = "{\n" +
                "  \"password\": \"Team0612\",\n" +
                "  \"username\": \"ViceDeanTeam06\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenTeacher(){
        String body = "{\n" +
                "  \"password\": \"Team0606\",\n" +
                "  \"username\": \"TeacherTeam0606\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenStudent(){
        String body = "{\n" +
                "  \"password\": \"Team0606\",\n" +
                "  \"username\": \"StudentTEAM06\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
}
