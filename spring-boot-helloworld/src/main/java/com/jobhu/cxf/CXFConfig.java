package com.jobhu.cxf;

import javax.servlet.Servlet;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jobhu.service.IUserService;

@Configuration
public class CXFConfig {

	@Autowired
	private Bus bus;
	
	@Autowired
	private IUserService userService;
	
	 /**
     * 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/soap/user?wsdl
     */
	@Bean
	public ServletRegistrationBean createDispatcherServlet() {
		return new ServletRegistrationBean<Servlet>(new CXFServlet(), "/soap/*");
	}
	
	@Bean
	public Endpoint userEndpoint() {
		EndpointImpl endpointImpl = new EndpointImpl(bus,userService);
		endpointImpl.publish("/user");
		return endpointImpl;
	}
}
