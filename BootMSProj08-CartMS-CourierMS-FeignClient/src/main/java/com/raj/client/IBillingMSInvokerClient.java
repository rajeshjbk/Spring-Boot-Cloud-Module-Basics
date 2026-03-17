package com.raj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("BillingMS")
public interface IBillingMSInvokerClient {

	@GetMapping("/billing-api/doBill")
	public ResponseEntity<String> invokeGenerateBillAmt();

	@GetMapping("/billing-api/wish/{user}")
	public String invokeShowWishMessage(@PathVariable String user);
	
}
