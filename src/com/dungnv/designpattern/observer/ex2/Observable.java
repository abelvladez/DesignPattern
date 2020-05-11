package com.dungnv.designpattern.observer.ex2;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	private List<ObserverInteger> observers = new ArrayList<ObserverInteger>();
	private List<Integer> content = new ArrayList<Integer>();
	
	public void addNumber(int nr) {
		content.add(nr);
	}
	
	public List<Integer> getContent() {
		return content;
	}
	
	public void registerObserver(ObserverInteger oi) {
		observers.add(oi);
	}
	
	public void notifyAll2() {
		for(ObserverInteger o : observers) {
			o.notify2();
		}
	}
	
}
