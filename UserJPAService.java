package com.akshay.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.user.model.User;
import com.akshay.user.model.UserRepository;


@Service
public class UserJPAService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> getUserById(Integer id)
	{
		return userRepository.findById(id);
	}

	public User createUser(User user)
	{
		return userRepository.save(user);
	}

	
}
