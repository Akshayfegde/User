package com.akshay.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import com.akshay.user.model.User;
import com.akshay.user.service.UserService;



@RestController
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping("/allusers")
	public List<User> findAllUser()
	{
		return userService.findAll();
	}
	
	
}
