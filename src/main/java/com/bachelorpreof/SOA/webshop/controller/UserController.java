package com.bachelorpreof.SOA.webshop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bachelorpreof.SOA.webshop.service.UserService;

@RestController
@RequestMapping("/login")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("")
	public void login(@RequestBody String body) {
		userService.login(body);
	}
	
}
