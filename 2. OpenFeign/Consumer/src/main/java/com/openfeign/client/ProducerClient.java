package com.openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer", url = "http://localhost:8080")
public interface ProducerClient {

    @GetMapping("/producer")
    String getInstance();
}
