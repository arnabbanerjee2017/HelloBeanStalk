package com.arnab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBeanStalkController {

	@Autowired
	HelloBeanStalkService service;
	
	@GetMapping("/beanstalk")
	public String getHelloBeanstalk() {
		return service.getHelloBeanStalk();
	}
	
	@RequestMapping("/health")
	public ResponseEntity<String> getHealth() {		
		ResponseEntity<String> entity = new ResponseEntity<String>("OK", HttpStatus.OK);		
		return entity;
	}
	
	
}
