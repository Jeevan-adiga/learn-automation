package com.learn.automation.webservices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.learn.automation.pojo.Person;

public class PostExample {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClients.createDefault();
		
		HttpPost postRequest = new HttpPost("https://postman-echo.com/post");
		postRequest.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
		
//		{
//			  "persons": [
//			    {
//			      "name": "Jeevan",
//			      "place": "Shimoga",
//			      "time": "7:00"
//			    },
//			    {
//			      "name": "Jeevan",
//			      "place": "Shimoga",
//			      "time": "7:00"
//			    }
//			  ]
//			}
		// --------- test-data
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(new Person("Jack", "Sparrow"));
		personsList.add(new Person("Penny", ""));
		personsList.add(new Person("Chandler", "Bing"));
		personsList.add(new Person("Don", "Draper"));
		personsList.add(new Person("Sheldon", "Cooper"));
		// --------- test-data
		
		JsonNodeFactory factory = JsonNodeFactory.instance;
		ObjectNode request = factory.objectNode();
		ArrayNode persons = request.putArray("persons");		
		for(Person prsn : personsList) {
			ObjectNode person = factory.objectNode();
			person.put("firstName", prsn.getFirstName());
			person.put("LastName", prsn.getLastName());
			person.put("time", prsn.getEmailAddress());		
			persons.add(person);			
		}
		
		StringEntity entity = new StringEntity(request.toString());
		System.out.println("Request Body:" + request.toString());
		postRequest.setEntity(entity);
		
		HttpResponse postResposne = client.execute(postRequest);
		
		System.out.println("Response Body:" + EntityUtils.toString(postResposne.getEntity()));
	}

}
