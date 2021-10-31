package com.ApiTesting.com.RestAssuredSamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Simple_Post_Request {
	
//	1.Post URL" "
//	2.Post Request is used to create a Resources on the web server
//	3.Status code Post request will be 201- which means a resource has been successfully created
//	4.Generally speaking we have to give necessary headers for authentication,
//	  content types,Accept and Json body to create the resources
//	5.To create the json body there are lot ways,you can create JSON using json-simple
//	  Gson,Jackson or any other json parsing library. We are going to use json simple.
//	  You can even keep the json body in a file and read the json from the json from that file instead of constructing it.
	
	@Test
	private void postRequestSample() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		
		JSONObject jsObj = new JSONObject();
		
		jsObj.put("name", "AbdulRahman");
		jsObj.put("job", "Testing Engineer");
		
//		System.out.println(jsObj.toString());
		
		ValidatableResponse statusCode = RestAssured
		.given()
		.header("", "")
		.body(jsObj.toJSONString())
		.post("/users")
		.then()
		.statusCode(201);

	}
	
	

}
