package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BootMsProj08CartMsCourierMsFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj08CartMsCourierMsFeignClientApplication.class, args);
	}

}
