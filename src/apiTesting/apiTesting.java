package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class apiTesting {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // GET request
        given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("title", notNullValue());

        // POST request
        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

        Response postResponse = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("foo"))
                .extract().response();

        String newId = postResponse.jsonPath().getString("id");
        System.out.println("Created Post ID: " + newId);
    }
}
