package com.jobhu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootHelloworld02ApplicationTests {

	
	@Autowired
	ApplicationContext ioc;
	
	@Test
	public void hello() {
		boolean flag = ioc.containsBean("helloService");
		System.out.println(flag);
	}
	
	@Test
	void contextLoads() {
	}

}
