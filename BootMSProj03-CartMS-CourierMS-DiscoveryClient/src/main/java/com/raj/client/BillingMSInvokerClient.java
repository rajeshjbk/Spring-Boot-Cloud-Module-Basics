package com.raj.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class BillingMSInvokerClient {

	@Autowired
	private DiscoveryClient client;
	
	public ResponseEntity<String> invokeGenerateBillAmt(){
		
		//get Target MS service instance
		List<ServiceInstance> list = client.getInstances("BillingMS");
		
		//choose the instance manually
		ServiceInstance instance = list.get(0);
		
		//get the endpoint details
		String url = instance.getUri()+"/billing-api/doBill";
		
		//create RestTemplate class object
		RestTemplate template = new RestTemplate();
		
		//invike the endpoint using exchange method
		ResponseEntity<String> resp = template.exchange(url,  HttpMethod.GET,null, String.class);
		
		return resp;
	}
}
