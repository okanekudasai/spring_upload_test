package com.ssafy.happy.user.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.happy.user.UserDto;
import com.ssafy.happy.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping(value = "/loadUser")
	public List<UserDto> loadUser() {
		List<UserDto> users = service.loadUser();
		System.out.println(users);
		return users;
	}
	
	@PostMapping(value = "/upload")
	public void upload(@RequestBody HashMap<String, String> map) {
		service.upload(map);
	}	
}
