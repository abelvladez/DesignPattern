package com.dungnv.designpattern.decorator.ex2;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Add features of Luxury Car");
	}
}
