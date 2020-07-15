package com.jobhu.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.jobhu.service.IUserService;

/**
 * CXF客户端
 * @author JobH
 *使用postman发送post请求
 *的参数设置raw xml
 *<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:ws="http://service.springbootTest.demo.cn" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
 <soap:Header></soap:Header>
  <soap:Body>
   <ws:sayHello>
   	  <name>张</name>
   </ws:sayHello>
  </soap:Body>
</soap:Envelope>
 */

public class CXFClient {
  public static void main(String[] args) {
	   
	  try {
		  //接口的地址
		  String address = "http://192.168.1.108:8083/spring-boot/soap/user?wsdl";
		  //代理工厂
		  JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		  jaxWsProxyFactoryBean.setAddress(address);//设置地址
		  //设置接口的类型
		  jaxWsProxyFactoryBean.setServiceClass(IUserService.class);
		  
		  //创建一个代理的实现类
		  
		  IUserService userService = (IUserService)jaxWsProxyFactoryBean.create();
		  
		  //数据准备
		  String userName = "小郑";
		  //调用代理的接口，并且返回数据
		  String result = userService.sayHello(userName);
		  System.out.println("返回的结果为:"+result);
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
   }
}
