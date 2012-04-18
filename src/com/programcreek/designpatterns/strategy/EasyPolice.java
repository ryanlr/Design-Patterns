package com.programcreek.designpatterns.strategy;

public class EasyPolice implements Strategy{

	@Override
	public void processSpeeding(int speed) {
		System.out.println("This is your first time, be sure don't do it again!");		
	}

}
