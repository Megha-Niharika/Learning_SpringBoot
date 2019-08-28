package com.AutowiredExample.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Component;

//@Configuration
@Controller
@Scope(value="prototype")
public class Human {

	private int  id;
	private String Name;
	private String Tech;
	public int i,n=10;
	
	
	//its searches by type
	@Autowired
	
	//its searches by name
	@Qualifier("lap1")
	private Laptop laptop;
	
	public Human() {
		super();
for(i=0;i<=n;i++)
	{
		System.out.println("object created" +i);
	}
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show()
	{
		System.out.println("object calling from human class");
		laptop.complier();
	}
	
	
	public void show1()
	{
		System.out.println("object");
		laptop.complier();
	}
}
