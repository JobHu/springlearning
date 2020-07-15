package com.jobhu.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace ="http://service.jobhu.com")//指定webservice的命名空间
public interface IUserService{

	@WebMethod(operationName="sayHello")
	String sayHello(@WebParam(name="name")String name);
}
