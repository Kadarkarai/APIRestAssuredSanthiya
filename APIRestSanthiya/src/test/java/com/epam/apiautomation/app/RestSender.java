package com.epam.apiautomation.app;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestSender {

	String body;
	Map <String,String> headers = new HashMap <String,String>();
	Map <String,String> cookies = new HashMap <String,String>();
	String responsecode;
	
	public Response postvalue(String baseurl,String contenttype,String body,String auth,String path) {
		RestAssured.baseURI=baseurl;
		return RestAssured
				.given()
				.header("Content-type",contenttype)
				.header("Authorization",auth)
				.and().body(body)
				.when().post("")
				.thenReturn();
	}
	
	public Response postvalue(String baseurl,String contenttype,String body,String path) {
		RestAssured.baseURI=baseurl;
		RestAssured.useRelaxedHTTPSValidation();
		return RestAssured
				.given()
				.header("Content-type",contenttype)
				.and().body(body)
				.when().post(path)
				.thenReturn();
	}

	public Response getvalue(RestContext rs) {
		RestAssured.baseURI = rs.getBaseurl();
		RestAssured.useRelaxedHTTPSValidation();
		return RestAssured.given()
				.header("Authorization",rs.AuthToken)
				.queryParams(rs.getQueryparam())
				.get()
				.then()
				.extract()
				.response();
	}
	
	
}
