package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepo extends JpaRepository<User,Long>
{

}
