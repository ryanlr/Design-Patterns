package com.programcreek.designpatterns.visitor;

public interface Visitor {
	public void visit(City city);
	public void visit(Museum museum);
	public void visit(Park park);
}
