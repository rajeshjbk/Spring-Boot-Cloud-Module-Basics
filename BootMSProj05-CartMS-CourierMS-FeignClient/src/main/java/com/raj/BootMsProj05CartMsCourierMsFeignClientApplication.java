package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootMsProj05CartMsCourierMsFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj05CartMsCourierMsFeignClientApplication.class, args);
	}

}
