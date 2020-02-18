package com.dungnv.designpattern.factory;

public class ShapeFactory {
	
	public Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		
		return null;
	}
	

}
