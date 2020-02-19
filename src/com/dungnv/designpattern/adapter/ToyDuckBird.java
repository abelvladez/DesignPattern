package com.dungnv.designpattern.adapter;

public class ToyDuckBird extends ToyDuck {

	private Bird bird;
	public ToyDuckBird(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		super.squeak();
		bird.makeSound();
	}
}
