package com.learn.automation.webservices;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class GetNodeConfig {
    public final long exit_code;
    public final Out out[];
    public final String[] error;

    @JsonCreator
    public GetNodeConfig(@JsonProperty("exit_code") long exit_code, 
    		@JsonProperty("out") Out[] out, 
    		@JsonProperty("error") String[] error){
        this.exit_code = exit_code;
        this.out = out;
        this.error = error;
    }

    public static final class Out {

        @JsonCreator
        public Out(){
        }
    }
}