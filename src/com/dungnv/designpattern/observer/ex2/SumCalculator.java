package com.dungnv.designpattern.observer.ex2;

public class SumCalculator implements ObserverInteger {
	private Observable target;
	public SumCalculator(Observable o) {
		this.target = o;
		o.registerObserver(this);
	}
	@Override
	public void notify2() {
		int sum = 0;
		for(int i: target.getContent()) {
			sum+=i;
		}
		System.out.println("Sum now is: " + sum);
	}

}
