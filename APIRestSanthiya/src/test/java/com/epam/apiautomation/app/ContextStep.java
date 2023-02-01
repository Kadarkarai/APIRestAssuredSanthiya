package com.epam.apiautomation.app;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.epam.apiautomation.models.Category;
import com.epam.apiautomation.models.Pet;
import com.epam.apiautomation.models.Tag;

import io.restassured.common.mapper.TypeRef;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ContextStep {

	private static ContextScenario scenario= new ContextScenario();
	Pet pet;
	Category categ;
	Tag tag;
	RestContext Rest;
	private RestSender restsender;
	private Response response;
	
	public ContextStep() {
		pet = new Pet();
		categ = new Category();
		tag = new Tag();
		Rest = new RestContext();
		restsender = new RestSender();
		response = new Response() {
			
			public ValidatableResponse then() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public long timeIn(TimeUnit timeUnit) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public long time() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public Response thenReturn() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String statusLine() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int statusCode() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public String sessionId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Headers headers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String header(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public long getTimeIn(TimeUnit timeUnit) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public long getTime() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public String getStatusLine() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int getStatusCode() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public String getSessionId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Headers getHeaders() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getHeader(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Cookies getDetailedCookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Cookie getDetailedCookie(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Map<String, String> getCookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getCookie(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getContentType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ResponseBody getBody() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Cookies detailedCookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Cookie detailedCookie(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Map<String, String> cookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String cookie(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String contentType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ResponseBody body() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Response andReturn() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String asString() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String asPrettyString() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public InputStream asInputStream() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public byte[] asByteArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public XmlPath xmlPath(CompatibilityMode compatibilityMode) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public XmlPath xmlPath(XmlPathConfig config) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public XmlPath xmlPath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T path(String path, String... arguments) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public JsonPath jsonPath(JsonPathConfig config) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public JsonPath jsonPath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public XmlPath htmlPath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Type cls, ObjectMapper mapper) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Type cls, ObjectMapperType mapperType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Class<T> cls, ObjectMapper mapper) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Class<T> cls, ObjectMapperType mapperType) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Type cls) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(TypeRef<T> typeRef) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T as(Class<T> cls) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String print() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String prettyPrint() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Response prettyPeek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Response peek() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	public ContextScenario getScenario() {
		return scenario;
	}

}
