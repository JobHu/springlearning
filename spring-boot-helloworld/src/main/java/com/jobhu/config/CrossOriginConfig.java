package com.jobhu.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域配置
 * Global CORS configuration
 * @author JobH
 *
 */
@Configuration
public class CrossOriginConfig {
	
	
	//@SuppressWarnings("deprecation")
	@Bean
	public WebMvcConfigurer crossConfig() {
	/*	return new WebMvcConfigurerAdapter() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
				//super.addCorsMappings(registry);
			}
			
		};*/
		
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
				//WebMvcConfigurer.super.addCorsMappings(registry);
				registry.addMapping("/**");
			}
			
		};
	}
      
}
