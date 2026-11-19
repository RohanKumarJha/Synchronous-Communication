package com.httpinterface.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("http://localhost:8080")
public interface ProducerClient {

    @GetExchange("/producer")
    String getMessage();
}