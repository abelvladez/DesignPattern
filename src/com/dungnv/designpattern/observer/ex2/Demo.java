package com.dungnv.designpattern.observer.ex2;

public class Demo {

	public static void main(String[] args) {
		Observable obj = new Observable();
		obj.addNumber(1);
		obj.addNumber(2);
		obj.addNumber(3);
		
		
		new SumCalculator(obj);
		new SumCalculator(obj);
		
		obj.addNumber(4);
		obj.notifyAll2();
		
		obj.addNumber(10);
		obj.notifyAll2();
		
		
	}
}
