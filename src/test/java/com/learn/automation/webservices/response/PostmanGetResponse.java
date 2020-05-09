package com.learn.automation.webservices.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public final class PostmanGetResponse {
    public final Args args;
    public final Headers headers;
    public final String url;

    @JsonCreator
    public PostmanGetResponse(@JsonProperty("args") Args args, 
    		@JsonProperty("headers") Headers headers, 
    		@JsonProperty("url") String url){
        this.args = args;
        this.headers = headers;
        this.url = url;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class Args {
        public final String foo1;
        public final String foo2;

        @JsonCreator
        public Args(@JsonProperty("foo1") String foo1, 
        		@JsonProperty("foo2") String foo2){
            this.foo1 = foo1;
            this.foo2 = foo2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class Headers {
        public final String xForwardedProto;
        public final String xForwardedPort;
        public final String host;
        public final String xAmznTraceId;
        public final String userAgent;
        public final String accept;
        public final String cacheControl;
        public final String postmanToken;
        public final String acceptEncoding;
        public final String cookie;

        @JsonCreator
        public Headers(@JsonProperty("x-forwarded-proto") String xForwardedProto, 
        		@JsonProperty("x-forwarded-port") String xForwardedPort, 
        		@JsonProperty("host") String host, 
        		@JsonProperty("x-amzn-trace-id") String xAmznTraceId, 
        		@JsonProperty("user-agent") String userAgent, 
        		@JsonProperty("accept") String accept, 
        		@JsonProperty("cache-control") String cacheControl,
        		@JsonProperty("postman-token") String postmanToken, 
        		@JsonProperty("accept-encoding") String acceptEncoding, 
        		@JsonProperty("cookie") String cookie){
            this.xForwardedProto = xForwardedProto;
            this.xForwardedPort = xForwardedPort;
            this.host = host;
            this.xAmznTraceId = xAmznTraceId;
            this.userAgent = userAgent;
            this.accept = accept;
            this.cacheControl = cacheControl;
            this.postmanToken = postmanToken;
            this.acceptEncoding = acceptEncoding;
            this.cookie = cookie;
        }
    }
}