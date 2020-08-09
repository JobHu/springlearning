package com.jobhu.config;


import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
/**
 * filter based cors support
 * @author JobH
 *
 */
@Configuration
public class FilterCorsConfig {
	
	
	@Bean
	public FilterRegistrationBean<Filter> corsFilter(){
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfig = new CorsConfiguration();
		corsConfig.setAllowCredentials(true);
		corsConfig.addAllowedOrigin("http://domain1.com");
		corsConfig.addAllowedHeader("*");
		corsConfig.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", corsConfig);
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>( new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}

}
