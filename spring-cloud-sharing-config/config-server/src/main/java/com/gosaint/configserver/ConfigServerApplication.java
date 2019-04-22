package com.gosaint.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

	//	//http://localhost:9003/global/dev/master
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
