package com.dungnv.designpattern.bridge;

public class Demo {

	/**
	 * 
	 * Idea: 
	 * - Use the Bridge pattern when you want to divide and organize a monolithic class that has several 
	 * variants of some functionality (for example, if the class can work with various database servers).
	 * - Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
	 * - Use the Bridge if you need to be able to switch implementations at runtime
	 * (many people confuse the Bridge with the Strategy pattern)
	 * 
	 * https://refactoring.guru/design-patterns/bridge
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
	}

	private static void testDevice(Device dev) {
		System.out.println("Test with basic remote");
		BasicRemote basicRemote = new BasicRemote(dev);
		basicRemote.power();
		basicRemote.channelUp();
		basicRemote.volumeUp();
		dev.printStatus();
		
		System.out.println("Test with advanced Remote");
		AdvanceRemote advanceRemote = new AdvanceRemote(dev);
		advanceRemote.power();
		advanceRemote.mute();
		dev.printStatus();
	}
	
	
}
