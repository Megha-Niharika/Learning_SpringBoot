package com.configuarationExample.configuaration_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Sumsung getPhone()
	{
		
		return new Sumsung();
	}
	
	@Bean
	public MobilePro getPro()
	{
	return new SnapDragon();
	
		
	}
}
