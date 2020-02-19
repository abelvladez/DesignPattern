package com.dungnv.designpattern.decorator.ex2;

public class CarMain {
	public static void main(String[] args) {
		
		
		Car c = new BasicCar();
		c.assemble();
		System.out.println("*****");
		Car sportcar = new SportCar(new BasicCar());
		sportcar.assemble();
		
		System.out.println("*****");
		Car luxurycar = new LuxuryCar(new BasicCar());
		luxurycar.assemble();
		
		System.out.println("*****");
		Car sportluxuryCar = new SportCar(new LuxuryCar(c));
		sportluxuryCar.assemble();
		
		System.out.println("****");
		Car truckCar = new TruckCar(new BasicCar());
		truckCar.assemble();
		
		
	}
}
