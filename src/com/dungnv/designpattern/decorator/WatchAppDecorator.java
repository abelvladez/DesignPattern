package com.dungnv.designpattern.decorator;

public class WatchAppDecorator extends AppDecorator {

	public WatchAppDecorator(App delegate) {
		this.delegate = delegate;
	}

	@Override
	public void developApp() {
		// TODO Auto-generated method stub
		this.delegate.developApp();
		System.out.println("Adding WatchApp extension");
	}

}
