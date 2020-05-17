package com.learn.automation.webservices;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;

public class PutExample {

	static HttpClientUtils httpClientUtils;
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		
		httpClientUtils = new HttpClientUtils();
		
		HttpPut httpPut = new HttpPut("https://reqres.in/api/users/2");
		httpPut.setHeader("Content-Type", "application/json");
		
		JSONObject jsonBody = new JSONObject();
		
		JSONObject dataObj = new JSONObject();
		dataObj.put("id", 2);
		dataObj.put("email", "janet.weaver@reqres.in");
		dataObj.put("first_name", "Janet");
		dataObj.put("last_name", "lname");
		dataObj.put("avatar", "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg");
		
		JSONObject adObj = new JSONObject();
		adObj.put("url", "http://statuscode.org/");
		adObj.put("company", "StatusCode Weekly");
		adObj.put("text", " weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.");

		jsonBody.put("data", dataObj);
		jsonBody.put("ad", adObj);
		
		httpPut.setEntity(new StringEntity(jsonBody.toJSONString()));
		
		HttpResponse httpResponse = httpClientUtils.httpClient.execute(httpPut);
		
		System.out.println(httpResponse.getStatusLine().getStatusCode());
		System.out.println(EntityUtils.toString(httpResponse.getEntity()));

	}

}
