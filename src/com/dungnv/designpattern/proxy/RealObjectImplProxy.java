package com.dungnv.designpattern.proxy;

public class RealObjectImplProxy extends RealObjectImpl {

	boolean isAdmin = false;
	
	public RealObjectImplProxy(boolean isAdmin) {
		this.isAdmin= isAdmin;
	}
	
	@Override
	public void doSomething() {
		if(!isAdmin) {
			System.out.println("Out of service!!!");
		}
		else {
			System.out.println("You are verified now!");
			super.doSomething();	
		}
		
	}
}
