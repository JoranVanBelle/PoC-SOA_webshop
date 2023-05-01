package com.bachelorpreof.SOA.webshop.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.bachelorpreof.SOA.webshop.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public boolean login(String body) {
		
		JSONObject json = new JSONObject(body);
		JSONObject login = json.getJSONObject("login");
		String username= login.getString("username");
		String password = login.getString("password");
		
		return userRepository.login(username, password);
	}
	
}
