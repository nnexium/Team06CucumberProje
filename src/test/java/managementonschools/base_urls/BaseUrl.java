package managementonschools.base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static managementonschools.utilities.Authentication.*;


public class BaseUrl {
    public static RequestSpecification specAdmin;
    public static RequestSpecification specDean;
    public static RequestSpecification specViceDean;
    public static RequestSpecification specTeacher;
    public static RequestSpecification specStudent;
    public static void setUpAdmin(){
        specAdmin = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenAdmin())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpDean(){
        specDean = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenDean())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpViceDean(){
        specViceDean = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenViceDean())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpTeacher(){
        specTeacher = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenTeacher())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpStudent(){
        specStudent = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenStudent())
                .setContentType(ContentType.JSON)
                .build();
    }
}
