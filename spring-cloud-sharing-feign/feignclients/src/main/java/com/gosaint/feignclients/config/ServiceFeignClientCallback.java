package com.gosaint.feignclients.config;

import com.gosaint.feignclients.feign.ServiceFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ServiceFeignClientCallback implements ServiceFeignClient{
    @Override
    public String getInfo(String name) {
        return "服务降级";
    }
}
