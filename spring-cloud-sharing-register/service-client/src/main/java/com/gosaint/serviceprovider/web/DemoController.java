package com.gosaint.serviceprovider.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @Autowired

    private RestTemplate restTemplate;

    /**
     * Ribbon的调用方式
     * @return
     */
    @GetMapping("/ribbon")
    public String restRibbon(){
        String serviceName="COMPUTE-SERVICE";
        ResponseEntity<String> entity = restTemplate.getForEntity("http://" + serviceName + "/getInfo?name=gosaint", String.class);
        String body = entity.getBody();
        return body;
    }
 
}