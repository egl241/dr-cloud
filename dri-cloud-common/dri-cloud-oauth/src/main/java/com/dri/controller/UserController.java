package com.dri.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	@GetMapping("/query")
	public String query() {
		return "test testing";
	}


}