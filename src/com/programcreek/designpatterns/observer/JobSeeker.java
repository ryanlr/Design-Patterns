package com.programcreek.designpatterns.observer;

public class JobSeeker implements Observer {

	private String name;
	
	public JobSeeker(String name){
		this.name = name;
	}
	@Override
	public void update(Subject s) {
		System.out.println(this.name + " got notified!");
		//print job list
		System.out.println(s);
	}
}
