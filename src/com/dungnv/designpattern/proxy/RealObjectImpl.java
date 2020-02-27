package com.dungnv.designpattern.proxy;

public class RealObjectImpl implements RealObject {

	@Override
	public void doSomething() {
		System.out.println("Doing something here");
	}

}
