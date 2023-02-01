package com.epam.apiautomation.steps;


import java.util.ArrayList;
import com.epam.apiautomation.app.Context;
import com.epam.apiautomation.app.ContextStep;
import com.epam.apiautomation.models.Pet;
import com.epam.apiautomation.models.Tag;
import com.google.inject.Inject;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class PETStepDefs extends CommonStep{


	ArrayList<String> photourls ;
	ArrayList<Tag> tags;
	String value;

	
	@Inject
	public PETStepDefs(ContextStep testContext) {
		super(testContext);
		tags = new ArrayList<Tag>();
		photourls = new ArrayList<String>();
	}

	
	
	@Given ("create the pet object with random information")
	public void createthepetobjectwithrandominformation() throws JsonProcessingException {
		step.getCateg().setId(2);
		step.getCateg().setName("whales");
		step.getPet().setCategory(step.getCateg());
		
		step.getPet().setName("test");
		
		photourls.add("https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
		step.getPet().setPhotoUrls(photourls);
		
		step.getTag().setId(1);
		step.getTag().setName("tag");
		tags.add(step.getTag());
		step.getPet().setTags(tags);
			
		step.getPet().setStatus("Pending");
		scenario.setObject(Context.IPET.toString(), step.getPet());
//		ObjectMapper om = new ObjectMapper();
//		String value =om.writeValueAsString(step.getPet());
//		System.out.println(value);
	}
	
	@When ("prepare for post request")
	public void  prepareforpostrequest() throws JsonProcessingException {
		System.out.println("Test "+conf.baseuri);
		step.setPet((Pet)scenario.getObject(Context.IPET.toString()));
		
//		step.getRest().setReqbody(step.getPet().toString());
		ObjectMapper om = new ObjectMapper();
		String value =om.writeValueAsString(step.getPet());
		System.out.println("from next method "+value);
	}
	
	@Then ("send the payload to url {string}")
	public void sendthepayloadtourl(String url) throws JsonProcessingException {
		step.setPet((Pet)scenario.getObject(Context.IPET.toString()));
		value = getvalue(step.getPet());
		System.out.println("from another method "+value);
		
		step.getRest().setResbody(step.getRestsender().postvalue(conf.baseuri, Context.JSON.toString(), value,url));
		scenario.setObject(Context.OPET.toString(), step.getRest().getResbody());
		System.out.println(step.getRest().getResbody().getBody().asPrettyString());
		String value = step.getRest().getResbody().getBody().asString();
		ObjectMapper om = new ObjectMapper();
		step.setPet(om.readValue(value,Pet.class));
		System.out.println("After response "+step.getPet().toString());
	}
	
	@Then("validate the response contains the status code as {string}")
	public void validatetheresponsecontainsthestatuscode(String statuscode) {
		step.setResponse((Response) scenario.getObject(Context.OPET.toString()));
		System.out.println("status code now "+step.getResponse().getStatusCode());
		System.out.println("content type now "+step.getResponse().getContentType());
		System.out.println("body value now "+step.getResponse().getBody().asString());
		
	}
	
	public String getvalue(Pet petvalue) throws JsonProcessingException {
		ObjectMapper om1 = new ObjectMapper();
		String valuetest =om1.writeValueAsString(petvalue);
		return valuetest;
	}
}
