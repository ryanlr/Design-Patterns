package com.programcreek.designpatterns.factory;

public class HumanFactory {
	public static Human createHuman(String m){
		Human p;
		if(m == "boy"){
			p = new Boy();
		}else if(m == "girl"){
			p = new Girl();
		}else{
			p = new Person();
		}
		return p;
	}
}
