package br.com.apione.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/hello")
public class Helloworld {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> findAll() {
		return ResponseEntity.ok().body("Hello world!");
	}
	
	@RequestMapping(value = "/apitwo", method = RequestMethod.GET)
	public ResponseEntity<String> findAll2() {
		String res = restTemplate.getForObject("http://apitwo-service/apitwo/two", String.class);
		return ResponseEntity.ok().body(res);
		
	}

	
}
