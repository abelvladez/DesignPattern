package com.dungnv.designpattern.state;

public class Demo {

	public static void main(String[] args) {
		TVContext remote = new TVContext();
		TVStartState startState = new TVStartState();
		TVStopState stopState = new TVStopState();
		
		remote.setState(startState);
		remote.doAction();
		
		remote.setState(stopState);
		remote.doAction();
		
	}
}
