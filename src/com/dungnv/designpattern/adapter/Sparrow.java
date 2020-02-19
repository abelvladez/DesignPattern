package com.dungnv.designpattern.adapter;

public class Sparrow implements Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can fly");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Sound of bird here");
	}

}
