package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringDemo {
	@Autowired
	StudentInfoRepo studentInfoRepo;
	public Student saveStudent(Student studentObj) 
	{
		studentInfoRepo.save(studentObj);
		return studentObj;
	}
	//getById
	public Optional<Student> getStudentById(Long id) 
	{
		return studentInfoRepo.findById(id);
	}
	//getAllStudents
	public List<Student> getAllStudent() 
	{
		return studentInfoRepo.findAll();
	}
	//UpdateStudent
	public Optional<Student> updateStudentById(Student studentObj,Long id)
	{
		Optional<Student> student= studentInfoRepo.findById(id);
		Student updStudent=student.get();
		updStudent.setEmail(studentObj.getEmail());
		updStudent.setId(studentObj.getId());
		studentInfoRepo.save(updStudent);
		return student;
	}

	
	

	public ArrayList<Student> studentDetails() {
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setId(1l);
		student1.setName("Poornima");
		student1.setEmail("Poorna@gmail.com");
		list.add(student1);
		Student student2 = new Student();
		student2.setId(2l);
		student2.setName("Keerthi");
		student2.setEmail("Keerthi@gmail.com");
		list.add(student2);
		Student student3 = new Student();
		student3.setId(3l);
		student3.setName("Meghana");
		student3.setEmail("Meghana@gmail.com");
		list.add(student3);
		return list;

	}

}
