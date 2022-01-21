package APIABSA;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
public class PostRequestABSA {

    private static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void postRequest() {
        System.out.println("How Body looks like: "+requestBody);
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();
        Assertions.assertEquals(201, response.statusCode());
        Assertions.assertEquals("foo", response.jsonPath().getString("title"));
        System.out.println("Title "+response.jsonPath().getString("title"));
        Assertions.assertEquals("bar", response.jsonPath().getString("body"));
        System.out.println("Body  "+response.jsonPath().getString("body"));
        Assertions.assertEquals("1", response.jsonPath().getString("userId"));
        System.out.println("User Id  "+response.jsonPath().getString("userId"));
        Assertions.assertEquals("101", response.jsonPath().getString("id"));
        System.out.println(" Id  "+response.jsonPath().getString("id"));
    }
}