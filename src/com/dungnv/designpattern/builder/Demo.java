package com.dungnv.designpattern.builder;

public class Demo {
	public static void main(String[] args) {
		Computer comp1 = new Computer.ComputerBuilder("SeaGate","8GB")
				.setBluetoothEnable(true)
				.setGraphicCardEnable(true)
				.build();
		
		
		Computer comp2 = new Computer.ComputerBuilder("WesternUnion", "16GB")
				.setGraphicCardEnable(false)
				.setBluetoothEnable(false)
				.build();
		
		
		System.out.println(String.format("Comp1 have config as: Hardisk(%s), RAM(%s), Card(%s), Bluetooth(%s)", 
				comp1.getHardDisk(), comp1.getRAM(), String.valueOf(comp1.isGraphicCardEnabled()),String.valueOf(comp1.isBluetoothEnabled())));
				
		System.out.println(String.format("Comp2 have config as: Hardisk(%s), RAM(%s), Card(%s), Bluetooth(%s)", 
				comp2.getHardDisk(), comp2.getRAM(), String.valueOf(comp2.isGraphicCardEnabled()),String.valueOf(comp2.isBluetoothEnabled())));
		
	}
}
