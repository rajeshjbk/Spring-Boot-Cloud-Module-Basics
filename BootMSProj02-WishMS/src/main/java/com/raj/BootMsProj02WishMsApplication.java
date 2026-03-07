package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj02WishMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj02WishMsApplication.class, args);
	}
}
