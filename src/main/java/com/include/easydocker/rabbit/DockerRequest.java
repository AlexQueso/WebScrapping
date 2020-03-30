package com.include.easydocker.rabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Zoltan Altfatter
 */
public class DockerRequest {

    private String function;
    private Map<String, String> body;
    private Runnable runnable;

    public DockerRequest(@JsonProperty("function") String function,
                         @JsonProperty("body") Map<String, String> body) {
        this.function = function;
        this.body = body;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Map<String, String> getBody() {
        return body;
    }

    public void setBody(Map<String, String> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "DockerRequest{" +
                "function='" + function + '\'' +
                ", body=" + body.toString() +
                '}';
    }
}