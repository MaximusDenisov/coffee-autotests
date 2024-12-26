package ru.krbk;

import groovy.util.logging.Slf4j;
import io.restassured.response.Response;
import org.testng.annotations.Test;

@Slf4j
public class HealthCheckTest {
    @Test(testName = "GetHealthCheck")
    public void testHealthCheck() {
        Response rs = BasicSteps.post("/coffees",200);
        System.out.printf(rs.asPrettyString());
    }
}
