package com.programcreek.designpatterns.singleton;

public class AmericaPresident {
	private AmericaPresident() {	}
	
	private static AmericaPresident thePresident;
	
	public static AmericaPresident getPresident(){
		if(thePresident == null)
			thePresident = new AmericaPresident();
		return thePresident;
	}
}
