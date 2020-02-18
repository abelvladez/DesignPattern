package com.dungnv.designpattern.decorator.ex2;

public class SportCar extends CarDecorator {
	
	public SportCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Add features of Sport car");
	}
}
