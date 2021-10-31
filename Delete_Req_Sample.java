package com.ApiTesting.com.RestAssuredSamples;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Delete_Req_Sample {
	
	@Test
	private void DeleteSample() {
		baseURI = "https://reqres.in/api";
		
		    given()
			.header("","")
			.when()
			.delete("/users/2")
			.then().statusCode(204);

	}
}
