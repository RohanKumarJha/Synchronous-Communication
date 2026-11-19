package com.openfeign.controller;

import com.openfeign.client.ProducerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final ProducerClient consumerClient;

    public ConsumerController(ProducerClient consumerClient) {
        this.consumerClient = consumerClient;
    }

    @GetMapping
    public String getInstance() {
        return consumerClient.getInstance();
    }
}
