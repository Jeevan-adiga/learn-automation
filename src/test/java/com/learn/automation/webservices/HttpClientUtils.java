package com.learn.automation.webservices;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClientUtils {

	HttpClient httpClient;
	
	public HttpClientUtils() {
		httpClient = HttpClients.createDefault();
	}
}
