package com.programcreek.designpatterns.visitor;

public class Museum implements Element {

	@Override
	public void accept(Visitor visitor) {
		System.out.println("Museum is accepting visitor.");
		visitor.visit(this);
	}

}
