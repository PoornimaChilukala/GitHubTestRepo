package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoRepo extends JpaRepository<Student, Long>
{

}

