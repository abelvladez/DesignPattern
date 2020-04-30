package com.dungnv.designpattern.command;

public class Stock {
	private String name="ABC";
	private int quantity = 10;
	
	public void buy() {
		System.out.println(String.format("Stock name:%s, quatity:%d was bought",name,quantity));
	}
	
	public void sell() {
		System.out.println(String.format("Stock name:%s, quatity:%d was sold",name,quantity));
	}
	
}
