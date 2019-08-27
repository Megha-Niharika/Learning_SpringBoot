package com.springbootMysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootMysql.model.Ticket;

public interface TicketDao  extends  CrudRepository<Ticket,Integer>{

	
	
}
