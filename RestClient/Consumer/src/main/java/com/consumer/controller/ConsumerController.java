package com.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final RestClient restClient;

    public ConsumerController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping
    public String getInstance() {
        return restClient.get()
                .uri("http://localhost:8081/producer")
                .retrieve()
                .body(String.class);
    }
}
