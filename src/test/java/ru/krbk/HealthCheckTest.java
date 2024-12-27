package ru.krbk;

import groovy.util.logging.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class HealthCheckTest {
    @Test(testName = "GetHealthCheck")
    public void testHealthCheck() throws Exception {
        BasicSteps.send("get", "/coffees", 200);
    }
}
