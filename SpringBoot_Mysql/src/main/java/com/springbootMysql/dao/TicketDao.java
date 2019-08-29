package com.springbootMysql.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootMysql.model.Ticket;

@Repository
public interface TicketDao  extends  CrudRepository<Ticket,Integer>{

	
	
}
