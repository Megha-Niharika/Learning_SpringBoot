package com.AutowiredExample.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import ch.qos.logback.core.Context;

@SpringBootApplication
public class AutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiredApplication.class, args);
		
		Human h = context.getBean(Human.class);
		
		h.show();
		
        Human h1 = context.getBean(Human.class);
		
		h1.show1();
	}

}
