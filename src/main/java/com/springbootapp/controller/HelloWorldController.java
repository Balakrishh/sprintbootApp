package com.springbootapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(path = "/hello")
	public ResponseEntity<String> HelloWorld(){
		return  new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}
