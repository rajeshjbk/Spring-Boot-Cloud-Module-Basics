package com.raj.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishServiiceMS {

	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
		
		return new ResponseEntity<String>("Hello, Good Morning"+instanceId, HttpStatus.OK);
	}
}
