package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.test"})
public class DemoMVCConfig  {
	
	@Bean
	public InternalResourceViewResolver getView() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		
		
		return resolver;
	}

}
