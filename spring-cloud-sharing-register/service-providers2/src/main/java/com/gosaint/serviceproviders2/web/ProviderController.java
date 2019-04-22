package com.gosaint.serviceproviders2.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    private static Logger logger = LoggerFactory.getLogger(ProviderController.class);



    @RequestMapping("/getInfo")
    public String getInfo(@RequestParam("name") String name) {
        String info = "hello, name = " + name + ", host = " + "localhost" + ", port = " + 7000;
        logger.info(info);
        return info;
    }
}
