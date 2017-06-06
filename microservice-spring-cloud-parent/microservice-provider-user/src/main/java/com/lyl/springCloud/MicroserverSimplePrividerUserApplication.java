package com.lyl.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserverSimplePrividerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserverSimplePrividerUserApplication.class, args);
	}
}
