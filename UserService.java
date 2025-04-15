package com.akshay.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.akshay.user.model.User;


@Service
public class UserService {

	public static List<User> userList=new ArrayList<>();
	static {
		userList.add(new User(100, "Bob"));
		userList.add(new User(101, "Alex"));
		userList.add(new User(102, "Sarah"));
	}
	
	//get all user
	public List<User> findAll()
	{
		return userList;
	}
	
	//get single element by id
	public User findById(Integer id)
	{
		User user=null;
		userList.stream().filter(t -> t.getId()==id).findFirst().get();
		return user;
	}
}
