package com.jobhu.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jobhu.service.HelloService;

@Configuration
public class MyConifgApp {
    
	@ConditionalOnMissingBean
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
