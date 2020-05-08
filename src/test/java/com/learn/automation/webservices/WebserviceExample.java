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

public class WebserviceExample {

	public static void main(String args[]) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClients.createDefault();
		
		HttpGet getNodeConfig = new HttpGet("http://localhost:3000/get_node_config");
		getNodeConfig.setHeader("Content-Type", "application/json");
		
		HttpResponse response = client.execute(getNodeConfig);
		System.out.println(response.getStatusLine().getStatusCode());
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		
		String responseString = EntityUtils.toString(response.getEntity());
		System.out.println("responseString" + responseString);
		
		ObjectMapper objectMapper = new ObjectMapper();
		GetNodeConfig getNodeConfigResponse = objectMapper.readValue(responseString, GetNodeConfig.class);
		
		for(int i=0; i< getNodeConfigResponse.error.length ; i++) {
			System.out.println("getNodeConfigResponse:" + getNodeConfigResponse.error[i]);
		}
		
	}
}
