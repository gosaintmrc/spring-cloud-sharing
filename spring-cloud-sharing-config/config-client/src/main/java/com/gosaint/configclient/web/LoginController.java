package com.gosaint.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
 
    @Value("${name}")
    String name;
    @Value("${age}")
    String age;
 
 
    @GetMapping("/login")
    public String login(){
        System.out.println("我的名字是"+name+"我的年龄是"+age);
        return "login";
    }
 
}