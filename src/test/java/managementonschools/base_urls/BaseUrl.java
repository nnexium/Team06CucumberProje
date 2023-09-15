package managementonschools.base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static managementonschools.utilities.Authentication.*;


public class BaseUrl {
    public static RequestSpecification spec;
    public static void setUpAdmin(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenAdmin())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpDean(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenDean())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpViceDean(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenViceDean())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpTeacher(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenTeacher())
                .setContentType(ContentType.JSON)
                .build();
    }
    public static void setUpStudent(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenStudent())
                .setContentType(ContentType.JSON)
                .build();
    }
}
