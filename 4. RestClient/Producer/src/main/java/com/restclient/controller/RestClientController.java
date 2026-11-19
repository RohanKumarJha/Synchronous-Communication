package com.restclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class RestClientController {

    @GetMapping
    public String getInstance() {
        return "This is producer class.";
    }
}
