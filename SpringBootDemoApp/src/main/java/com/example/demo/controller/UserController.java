package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController 
{
	@Autowired
	UserService userService;
 @GetMapping
 public List<User> getAllUser()
 {
	 return userService.getUser();
 }
 @PostMapping
 public User saveAllUser(@RequestBody User user)
 {
	 userService.saveUser(user);
	 return user;
	 
 }
}
