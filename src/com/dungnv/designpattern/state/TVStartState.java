package com.dungnv.designpattern.state;

public class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("Start TV now... ");
	}

}
