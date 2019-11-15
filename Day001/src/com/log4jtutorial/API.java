package com.log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API {
	
	
	@Test
	     
	    public void api()
	    {
	    	RestAssured.baseURI="https://blog.testproject.io/2016/04/17";
	   RequestSpecification 	httprequest=RestAssured.given();
	                      Response      response=httprequest.request(Method.GET,"/api-testing-using-selenium-webdriver-java/" );
	                String   responsebody  = response.getBody().asString();
	   System.out.println(responsebody);
	    }
	}	
	


