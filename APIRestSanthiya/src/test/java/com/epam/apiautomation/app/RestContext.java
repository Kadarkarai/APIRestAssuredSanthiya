package com.epam.apiautomation.app;

import java.util.HashMap;
import java.util.Map;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RestContext {

	String baseurl;
	String AuthToken;
	String contenttype;
	String reqbody;
	String responsecode;
	Response resbody;
	
	Map <String,String> reqheaders = new HashMap <String,String>();
	Map <String,String> queryparam = new HashMap <String,String>();
	Map <String,String> resheaders = new HashMap <String,String>();
	Map <String,String> rescookies = new HashMap <String,String>();
	
}
