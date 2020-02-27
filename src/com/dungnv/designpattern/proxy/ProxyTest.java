package com.dungnv.designpattern.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		RealObject obj = new RealObjectImplProxy();
		obj.doSomething();
	}
}
