package com.SharathInfotech.PoServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class PoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoServicesApplication.class, args);
	}

}
