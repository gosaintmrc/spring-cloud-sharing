package com.gosaint.springbootserviceprovider.com.gosaint.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestProvider {

    @GetMapping("/admin/user")
    public String queryUser(@RequestParam long id) {
        return "ID为"+id+"用户是张三";
    }
}
