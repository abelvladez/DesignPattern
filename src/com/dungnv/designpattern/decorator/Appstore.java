package com.dungnv.designpattern.decorator;

public class Appstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final TVAppDecorator tvApp = new TVAppDecorator(new IOSApp());
		final WatchAppDecorator watchApp = new WatchAppDecorator(new IOSApp());
		
		final GGAppDecorator ggApp = new GGAppDecorator(new AndroidApp());
		
		tvApp.developApp();
		
		System.out.println("------");
		watchApp.developApp();
		
		System.out.println("------");
		ggApp.developApp();
	}

}
