package com.programcreek.designpatterns.state;

interface State {
	public void saySomething(StateContext sc);
}

class Rich implements State{
	@Override
	public void saySomething(StateContext sc) {
		System.out.println("I'm rick currently, and play a lot.");
		sc.changeState(new Poor());
	}
}

class Poor implements State{
	@Override
	public void saySomething(StateContext sc) {
		System.out.println("I'm poor currently, and spend much time working. ");
		sc.changeState(new Rich());
	}
}