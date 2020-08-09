package com.jobhu.springComponent;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
//@Configurable(preConstruction = true)
@Component
public class Transmission {

	
	private int gear;

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
}
