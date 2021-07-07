package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String getMessage() {
		return "THIS IS FROM MY SERVER ";
	}
	
	@GetMapping("/map")
	public String validate() {
		return "validate";
	}
}
