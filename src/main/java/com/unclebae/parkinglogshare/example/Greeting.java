package com.unclebae.parkinglogshare.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by KIDO on 2017. 1. 23..
 */
public class Greeting extends ResourceSupport {

    private final String content;

//    comment : @JonCreator : single on how Jackson can create an instance of this POJO
//    comment : @JsonProperty : clearly marks what field Jackson should put this constructor argument into
    @JsonCreator
    public Greeting(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
