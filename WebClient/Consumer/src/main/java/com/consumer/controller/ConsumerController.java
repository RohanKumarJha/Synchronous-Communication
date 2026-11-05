package com.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final WebClient webClient;

    public ConsumerController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping
    public String getInstance() {
        return webClient.get()
                .uri("http://localhost:8081/producer")
                .retrieve().bodyToMono(String.class).block();
    }
}
