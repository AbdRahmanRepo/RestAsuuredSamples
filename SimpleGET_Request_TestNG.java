package com.ApiTesting.com.RestAssuredSamples;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SimpleGET_Request_TestNG {
//	        1.Hit the Get Request of Rest Assured for given link
//			2.Store the result in a Rest Assured Response data type
//			3.From the Response,Either use body() or getBody() to obtain thr response body
//			4.The response obtained is like a Json object, so obtain the response as string
//			using asString() or if you want to pretty print the Json asPrettyString()
	
	
	@Test
	private void Simple_Get() {
		Response response = RestAssured.get("http://reqres.in/api/users/3");
		
//		response.getBody();
		ResponseBody body = response.body();
		
		System.out.println(body.asPrettyString());

	}
	
	@Test
	private void GET_UsingMethodChaining() {
		RestAssured.baseURI = "https://reqres.in/api";
		
		//given - used to param, authentications, Header
		Response response = RestAssured
							.given()
							.param("", "")
							.when()
							.get("/users/3");
		ValidatableResponse statusCode = RestAssured
										.given()
										.when()
										.get("/users/3")
										.then()
										.statusCode(200);
		
		System.out.println(response.asPrettyString());
		System.out.println(statusCode.toString());
	}
	
	
}
