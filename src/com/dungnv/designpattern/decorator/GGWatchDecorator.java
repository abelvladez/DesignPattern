package com.dungnv.designpattern.decorator;

public class GGWatchDecorator extends AppDecorator {

	public GGWatchDecorator(App delegate) {
		// TODO Auto-generated constructor stub
		this.delegate = delegate;
	}
	@Override
	public void developApp() {
		this.delegate.developApp();
		System.out.println("Adding Google Watch extension!");
	}

	
	
}
