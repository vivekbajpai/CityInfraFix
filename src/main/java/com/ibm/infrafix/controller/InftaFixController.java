package com.ibm.infrafix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InftaFixController {
	
	@GetMapping
	public String helloMessage() {
		return "Welcome to Infra Fix Service";
	}

}
