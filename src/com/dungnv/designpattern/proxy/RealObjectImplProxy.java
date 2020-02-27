package com.dungnv.designpattern.proxy;

public class RealObjectImplProxy extends RealObjectImpl {
	@Override
	public void doSomething() {

		System.out.println("Doing check something before deleate to real Object");
		super.doSomething();
	}
}
