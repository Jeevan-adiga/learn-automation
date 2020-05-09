package com.learn.automation.webservices;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.automation.webservices.response.PostmanGetResponse;

public class GetExample {

	public static void main(String args[]) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClients.createDefault();
		
		HttpGet getNodeConfig = new HttpGet("https://postman-echo.com/get?foo1=bar1&foo2=bar2");
		getNodeConfig.setHeader("Content-Type", "application/json");
		
		HttpResponse response = client.execute(getNodeConfig);
		System.out.println(response.getStatusLine().getStatusCode());
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		
		String responseString = EntityUtils.toString(response.getEntity());
		System.out.println("responseString" + responseString);
		
		ObjectMapper objectMapper = new ObjectMapper();
		PostmanGetResponse postmanGetResponse = objectMapper.readValue(responseString, PostmanGetResponse.class);
		
		System.out.println("Host:" + postmanGetResponse.headers.host);
		
	}
	
}
