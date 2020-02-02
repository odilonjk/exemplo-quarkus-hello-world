package com.workdpress.krogercode.helloworld;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloWorldTest {

    @Test
    public void shouldReturnHelloWorld() {
        given()
                .when()
                .get("/hello-world")
                .then()
                .statusCode(200)
                .body(is("Hello world!"));
    }

    @Test
    public void shouldReturnHelloWorldConcatenatedWithTheName() {
        given()
                .when()
                .get("/hello-world/Homer")
                .then()
                .statusCode(200)
                .body(is("Hello world, Homer"));
    }

}
