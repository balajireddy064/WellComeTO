package com.EurekaServer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplicationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplicationDemoApplication.class, args);
	}

}
