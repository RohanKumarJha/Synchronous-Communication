package com.consumer.controller;

import com.consumer.client.ProducerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final ProducerClient producerClient;

    public ConsumerController(ProducerClient producerClient) {
        this.producerClient = producerClient;
    }

    @GetMapping
    public String getInstance() {
        return producerClient.getMessage();
    }
}
