package com.voltaware.sais;

import com.jayway.restassured.response.Response;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testHealthCheck() {
        Response response = get("http://localhost:8200/api/health/alive").andReturn();
        assertEquals(response.getStatusCode(), 200);
    }

}
