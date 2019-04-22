package com.gosaint.feignclients.web;

import com.gosaint.feignclients.feign.ServiceFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    private static Logger logger = LoggerFactory.getLogger(FeignController.class);
    @Autowired
    private ServiceFeignClient serviceFeignClient;

    @GetMapping("/getInfo")
    public String getInfo(@RequestParam("name") String name) {

        String info = serviceFeignClient.getInfo(name);
        logger.info(info);
        return info;
    }
}
