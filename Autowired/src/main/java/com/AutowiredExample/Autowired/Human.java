package com.AutowiredExample.Autowired;

//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Component;

//@Configuration
@Controller
public class Human {

	private int  id;
	private String Name;
	private String Tech;
	
	
	public Human() {
		super();
		System.out.println("object created");
		
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
	
	public void show()
	{
		System.out.println("object calling from human class");
	}
	
}
