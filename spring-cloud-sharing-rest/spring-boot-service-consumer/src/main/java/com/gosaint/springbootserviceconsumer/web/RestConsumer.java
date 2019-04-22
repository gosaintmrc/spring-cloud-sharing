package com.gosaint.springbootserviceconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestConsumer {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public String queryUser(@RequestParam long id) {
        ResponseEntity<String> entity =
                restTemplate.getForEntity("http://localhost:8090/admin/user?id="+id, String.class);
        String body = entity.getBody();
        return body;
    }
}