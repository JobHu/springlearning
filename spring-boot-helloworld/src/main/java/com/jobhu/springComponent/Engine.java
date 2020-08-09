package com.jobhu.springComponent;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

//@Configurable(preConstruction = true)
@Component
public class Engine {
	
	public void go() {
		System.out.println("  go  home");
	}

}
