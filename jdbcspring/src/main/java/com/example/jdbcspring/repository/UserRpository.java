package com.example.jdbcspring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRpository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<String> getAllUserNames() {
		// TODO Auto-generated method stub
		
		
		List<String> usernameList = new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("select name from user;",String.class));
		
		//jdbcTemplate.queryForList("select name from user",String.class);
		return usernameList;
	}

	
	
	public List<String> getAlldata() {
		// TODO Auto-generated method stub
		
		
		List<String> userdetails = new ArrayList<>();
		userdetails.addAll(jdbcTemplate.queryForList("select * from user;",String.class));
		
		//jdbcTemplate.queryForList("select name from user",String.class);
		return userdetails;
	}

	
	
	
	
}
