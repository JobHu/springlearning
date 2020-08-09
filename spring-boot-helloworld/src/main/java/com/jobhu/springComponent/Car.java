package com.jobhu.springComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
@Configurable(preConstruction = true)//自定义注入实例，就是自己new一个对象
@Component
public class Car {

	
	@Autowired
	private Engine engine;
	
	@Autowired
	private Transmission transmission;
	
	public void startCar() {
		transmission.setGear(1);
		engine.go();
		System.out.println("car started");
	}
	
	
}
