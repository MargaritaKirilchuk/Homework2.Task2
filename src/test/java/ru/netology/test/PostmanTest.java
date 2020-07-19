package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldCheckPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Name")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Name"));
    }
}
