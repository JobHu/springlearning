package com.jobhu.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * 动态调用
 * @author JobH
 *
 */
public class CXFClient2 {
   public static void main(String[] args) {
	
	   //创建动态的客户端
	   JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
	   Client client = jaxWsDynamicClientFactory.createClient("http://192.168.1.108:8083/spring-boot/soap/user?wsdl");
	   
	   //需要密码的情况下加上用户名和密码
	// client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
	   Object[] objs = new Object[0];
	   
	   try {
		   objs =  client.invoke("sayHello", "校长");
		   System.out.println("返回数据："+objs[0]);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
}
}
