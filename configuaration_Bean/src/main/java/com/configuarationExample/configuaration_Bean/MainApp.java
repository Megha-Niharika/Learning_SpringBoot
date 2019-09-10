package com.configuarationExample.configuaration_Bean;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainApp {

	private static ApplicationContext factory;

	public static void main(String[] args) {
		
		//SpringApplication.run(MainApp.class, args);
		
		factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Sumsung s7 = factory.getBean(Sumsung.class);
		s7.config();
	}

}
