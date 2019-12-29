package com.jobhu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jobhu.service.HelloService;

//配置类,替代之前的配置文件
//配置文件中是通过bean标签来添加类的
@Configuration
public class MyAppConfig {

	//将方法的返回值添加到容器中
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
