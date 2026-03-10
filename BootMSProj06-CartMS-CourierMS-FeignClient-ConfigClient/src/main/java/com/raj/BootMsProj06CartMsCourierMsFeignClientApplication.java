package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootMsProj06CartMsCourierMsFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj06CartMsCourierMsFeignClientApplication.class, args);
	}

}
