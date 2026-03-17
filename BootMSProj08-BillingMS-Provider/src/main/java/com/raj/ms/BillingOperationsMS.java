package com.raj.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMS {

	@Value("${spring.application.instance-id}")
	private String instance_id;
	
	@GetMapping("/doBill")
	public ResponseEntity<String> generateBillAmount(){
		
		//generate the bill amount
		double bamt = new Random().nextDouble(400000);
		
		//show the bill amount
		return new ResponseEntity<String>("Bill Amount is : "+bamt+"..."+instance_id, HttpStatus.OK);
	}
	
	@GetMapping("/wish/{user}")
	public ResponseEntity<String> showWishMessage(@PathVariable String user){
		
		return new ResponseEntity<String>("Good Morning "+user,HttpStatus.OK);
	}
}
