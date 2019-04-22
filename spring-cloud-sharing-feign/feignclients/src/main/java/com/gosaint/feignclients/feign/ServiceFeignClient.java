package com.gosaint.feignclients.feign;

import com.gosaint.feignclients.config.ServiceFeignClientCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "COMPUTE-SERVICE", fallback = ServiceFeignClientCallback.class)
public interface ServiceFeignClient {

    @RequestMapping("/getInfo")
    String getInfo(@RequestParam("name") String name);
}
