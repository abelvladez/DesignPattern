package com.dungnv.designpattern.adapter;

public class AdapterMain {
	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		Duck toyDuck = new ToyDuck();
		
		ToyDuckBird tdb = new ToyDuckBird(new Sparrow());
		
		System.out.println("Bird make sounds:");
		sparrow.makeSound();
		
		System.out.println("----");
		
		System.out.println("Duck make sounds:");
		toyDuck.squeak();
		
		System.out.println("----");
		
		System.out.println("ToyDuck make sounds:");
		tdb.squeak();
		
	}
}
