package com.programcreek.designpatterns.factory;

public class Girl implements Human{

	@Override
	public void Talk() {
		System.out.println("Girl is talking...");	
	}

	@Override
	public void Walk() {
		System.out.println("Girl is walking...");
	}

}
