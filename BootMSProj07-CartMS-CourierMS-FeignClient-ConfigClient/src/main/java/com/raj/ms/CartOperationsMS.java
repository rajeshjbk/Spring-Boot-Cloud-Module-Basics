package com.raj.ms;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.client.IBillingMSInvokerClient;

@RestController
@RequestMapping("/cart-api")
public class CartOperationsMS {

	@Autowired
	private IBillingMSInvokerClient client;
	
	@Value("${db.user}")
	private String duser;
	
	@Value("${db.password}")
	private String password;

	@GetMapping("/cart/{user}")
	public ResponseEntity<String> cartOperations(@PathVariable String user){
		
		System.out.println("CartOperationsMS.cartOperations()->client comp class name: "+client.getClass());
		
		//add Items to cart
		String[] items = new String[] {"shirt","trouser"};
		
		//invoke target method
		ResponseEntity<String> resp = client.invokeGenerateBillAmt();
		
		//prepare final message having both outputs
		String finalMsg = "Items Added to cart are "+Arrays.toString(items)+" ... "+resp.getBody()+" ... "+client.invokeShowWishMessage(user)+" ... "+duser+" ... "+password;
		
		//return the ResponseEntity object
		return new ResponseEntity<String>(finalMsg,HttpStatus.OK);
	}
}
