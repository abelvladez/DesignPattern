package com.dungnv.designpattern.decorator;

public class GGAppDecorator extends AppDecorator {

	
	
	public GGAppDecorator(App delegate) {
		this.delegate = delegate;
	}

	@Override
	public void developApp() {
		this.delegate.developApp();
		System.out.println("Developing GG extension");
	}

}
