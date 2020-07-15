package com.jobhu.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.jobhu.service.IUserService;

@Component
@WebService(targetNamespace = "http://service.jobhu.com",
endpointInterface = "com.jobhu.service.IUserService", 
serviceName="sayHello")
public class UserServiceImpl implements IUserService{

	@Override
	public String sayHello(String name) {
		return "hello"+name;
	}

}
