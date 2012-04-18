package com.programcreek.designpatterns.strategy;

public class HardPolice implements Strategy{

	@Override
	public void processSpeeding(int speed) {
		System.out.println("Your speed is "+ speed+ ", and should get a ticket!");
	}

}
