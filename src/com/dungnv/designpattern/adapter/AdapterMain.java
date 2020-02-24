package com.dungnv.designpattern.adapter;

public class AdapterMain {
	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		Duck toyDuck = new ToyDuck();
		
		ToyDuckBird tdb = new ToyDuckBird(new Sparrow());
		ToyDuckBird2 tdb2 = new ToyDuckBird2();
		
		System.out.println("Bird make sounds:");
		sparrow.makeSound();
		
		System.out.println("----");
		
		System.out.println("Duck make sounds:");
		toyDuck.squeak();
		
		System.out.println("----");
		
		System.out.println("ToyDuckBird make sounds:");
		tdb.squeak();
		
		System.out.println("----");
		System.out.println("ToyDuckBird2 make sounds");
		tdb2.squeak();
	}
}
