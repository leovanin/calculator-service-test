package com.devgrid;

import com.jayway.restassured.response.Response;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testHealthCheck() {
        Response response = get("http://localhost:8200/api/health/alive").andReturn();
        assertEquals(response.getStatusCode(), 200);
    }


    @Test
    public void testMultiplyCase1() {
        Response response = get("http://localhost:8200/calculator/multiply?a=3&b=4").andReturn();
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.body().asString(), "11");
    }


    @Test
    public void testMultiplyCase2() {
        Response response = get("http://localhost:8200/calculator/multiply?a=5&b=7").andReturn();
        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.body().asString(), "35");
    }


//    @Test
//    public void failingTest() {
//        Response response = get("http://localhost:8200/calculator/multiply?a=5&b=7").andReturn();
//        assertEquals(response.getStatusCode(), 200);
//        assertEquals(response.body().asString(), "3333333");
//    }


}
