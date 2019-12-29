package com.jobhu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobhu.pojo.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootHelloworldApplicationTests {


	@Autowired
	Person person;
	
	@Autowired
	ApplicationContext ioc ;
	
	@Test
	public void helloSerive() {
		boolean flag = ioc.containsBean("helloService");
		System.out.println(flag);
	}
	
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
