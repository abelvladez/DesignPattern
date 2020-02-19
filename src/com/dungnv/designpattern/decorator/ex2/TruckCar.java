package com.dungnv.designpattern.decorator.ex2;

public class TruckCar extends CarDecorator {

	public TruckCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding feature of a truck car!");
		
	}
	
}
