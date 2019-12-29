package com.jobhu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:bean.xml"})//引入xmlbean的资源
@SpringBootApplication
public class SpringBootHelloworldApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloworldApplication.class, args);
	}

}
