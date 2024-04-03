package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBootController")
//controller
public class SpringBootController {
	@Autowired
	SpringDemo springDemo;

	@GetMapping("/getStudentById/{id}")
	public Optional<Student> getMethod(@PathVariable Long id) 
	{
		return springDemo.getStudentById(id);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getStudents() 
	{
		return springDemo.getAllStudent();
	}
	
	@PutMapping("/updateStudentById/{id}")
	public Optional<Student> updateStudents(@PathVariable Long id,@RequestBody Student student) 
	{
		return springDemo.updateStudentById(student, id);
	}



	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student) {
		springDemo.saveStudent(student);
		return student;
	}

}
