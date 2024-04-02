package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService{
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	public User saveUser(User userObj)
	{
		userObj.setDate(new Date());
		userObj.setStatus(true);
		userRegistrationRepo.save(userObj);
		return userObj;
	}
   public List<User> getUser()
   {
	   return userRegistrationRepo.findAll();
   }

}
