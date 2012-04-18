package com.programcreek.designpatterns.factory;

public class Person implements Human {

	@Override
	public void Talk() {
		System.out.println("a person is talking...");		
	}

	@Override
	public void Walk() {
		System.out.println("a person is running...");
	}


}
