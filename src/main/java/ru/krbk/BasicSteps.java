package ru.krbk;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BasicSteps {
    private static final String host = "http://78.138.173.155:4323";

    public static Response send(String method, String endpoint, int code) throws Exception {
        RequestSpecification request = RestAssured.given().baseUri(host).basePath(endpoint);
        Response response;

        switch (method) {
            case "get": {
                response = request.get();
                break;
            }
            case "post": {
                response = request.post();
                break;
            }
            case "put": {
                response = request.put();
                break;
            }
            case "delete": {
                response = request.delete();
                break;
            }
            default: {
                throw new Exception("Доступные методы: get, post, put, delete ");
            }
        }
        return response.then()
                .log().all()
                .statusCode(code)
                .extract().response();
    }
}
