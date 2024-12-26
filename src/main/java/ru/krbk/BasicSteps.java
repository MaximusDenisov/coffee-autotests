package ru.krbk;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicSteps {
    private static final String host = "http://78.138.173.155:4323"; //временное решение

    public static Response post(String endpoint, int code) {
        return RestAssured.given()
                .baseUri(host)
                .basePath(endpoint)
                .get()
                .then()
                .statusCode(code)
                .extract().response();
    }
}
