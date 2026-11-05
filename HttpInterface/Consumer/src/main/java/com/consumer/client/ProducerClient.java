package com.consumer.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("http://localhost:8081")
public interface ProducerClient {

    @GetExchange("/producer")
    String getMessage();
}
