package com.dungnv.designpattern.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory  factory = new ShapeFactory();
		
		
		Shape shape1 = factory.getShape("Rectangle");
		shape1.draw();
		
		Shape shape2 = factory.getShape("Square");
		shape2.draw();
		
	}

}
