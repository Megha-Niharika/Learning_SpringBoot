package com.example.jdbcspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbcspring.repository.UserRpository;

@RestController
@RequestMapping(path="/user")

public class UserController {

	@Autowired
	UserRpository userRepository;
	
	@GetMapping()
	public String check()
	{
		return "Welcome to java spring boot";
		
	}
	
	
	@GetMapping(path="/getusername")
	public List<String> getAllUserNames()
	{
		return userRepository.getAllUserNames();
	}
	
	
	@GetMapping(path="/getdb")
	public List<String> getAlldata()
	{
		return userRepository.getAlldata();
	}
	
	
}
