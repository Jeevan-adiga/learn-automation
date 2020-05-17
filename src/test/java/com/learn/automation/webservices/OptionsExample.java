package com.learn.automation.webservices;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;

public class OptionsExample {

	public static void main(String args[]) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClients.createDefault();
		
		HttpOptions getNodeConfig = new HttpOptions("https://reqres.in/api/users/2");
		getNodeConfig.setHeader("Content-Type", "application/json");
		
		HttpResponse response = client.execute(getNodeConfig);
		System.out.println(response.getStatusLine().getStatusCode());
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 204);
		
		Header[] headers = response.getHeaders("Access-Control-Allow-Methods");
		
		for(Header header : headers) {
			System.out.println(header.getName() + ":" + header.getValue());			
		}
		
	}
	
}
