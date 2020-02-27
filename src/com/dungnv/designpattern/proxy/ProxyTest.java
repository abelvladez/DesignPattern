package com.dungnv.designpattern.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		RealObject obj = new RealObjectImplProxy(false);
		obj.doSomething();
		
		RealObject obj2 = new RealObjectImplProxy(true);
		obj2.doSomething();
	}
}
