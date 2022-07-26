package com.example.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserAppController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/invoke")
    public String invokeChatBook() {
        String url = "http://chatbook/chatbook-application/chat";
        return restTemplate.getForObject(url, String.class);
    }
}
