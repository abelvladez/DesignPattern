package com.dungnv.designpattern.decorator;

public class TVAppDecorator extends AppDecorator {

	
	
	public TVAppDecorator(App delegate) {
		this.delegate = delegate;
	}

	@Override
	public void developApp() {
		this.delegate.developApp();
		System.out.println("Adding TV extension");
	}

}
