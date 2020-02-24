package com.dungnv.designpattern.adapter;

public class ToyDuckBird2 extends Sparrow implements Duck {

	@Override
	public void squeak() {
		System.out.println("I am a toy duck, here is may squeak");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Sound of toyduckbird2");
	}
	
	@Override
	public void fly() {
		System.out.println("I also can fly");
	}

}
