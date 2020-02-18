package com.dungnv.designpattern.decorator;

public class AndroidTVDecorator extends AppDecorator {

	public AndroidTVDecorator(App instance) {
		this.delegate = instance;
	}

	@Override
	public void developApp() {
		this.delegate.developApp();
		System.out.println("Adding feature for Android TV");
	}
}
