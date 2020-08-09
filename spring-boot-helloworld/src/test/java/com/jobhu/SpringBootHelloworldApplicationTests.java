package com.jobhu;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.jobhu.pojo.Person;
import com.jobhu.springComponent.Car;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootHelloworldApplicationTests {


/*	@Autowired
	Person person;
	
	@Autowired
	//ApplicationContext ioc ;
	//ClassPathXmlApplicationContext:类路径加载
     //FileSystemXmlApplicationContext:文件系统路径加载
     //AnnotationConfigApplicationContext:用于基于注解的配置
      //WebApplicationContext:专门为web应用准备的，从相对于Web根目录的路径中装载配置文件完成初始化
	
	@Test
	public void helloSerive() {
		boolean flag = ioc.containsBean("helloService");
		System.out.println(flag);
	}
	
	@Test
	void contextLoads() {
		System.out.println(person);
	}*/
	
	/*@Autowired
	Car car;*/
	
	
	@Test
	void contextLoads() {
		Car car = new Car();//自定义new 对象，这个时候需要使用@Configurable注解
		car.startCar();
	}

}
