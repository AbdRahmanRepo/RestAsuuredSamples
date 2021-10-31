package com.ApiTesting.com.RestAssuredSamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Put_Request_Sample {
	
	@Test
	private void putRequest() {
		JSONObject jsObj = new JSONObject();
		
		jsObj.put("name","AbdulRahman");
		jsObj.put("job", "Quality Assurance");
		
		RestAssured.baseURI = "https://reqres.in/api";
		
//		ValidatableResponse statusCode = RestAssured
//				.given()
//				.header("", "")
//				.body(jsObj.toJSONString())
//				.put("/user/2")
//				.then()
//				.statusCode(200);
		ValidatableResponse statusCode = RestAssured
				.given()
				.header("", "")
				.body(jsObj.toJSONString())
				.patch("/user/2")
				.then()
				.statusCode(200);


	}
	
}
