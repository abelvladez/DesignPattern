package com.dungnv.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public ShoppingCart() {
		itemList = new ArrayList<Item>();
	}

	private List<Item> itemList;

	private int calculateTotal() {
		int sum = 0;
		for (Item i : itemList) {
			sum += i.getPrice();
		}
		return sum;
	}

	public void pay(PaymentType paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

	public void addItem(Item item) {
		itemList.add(item);
	}

	public void removeItem(Item item) {
		itemList.remove(item);
	}

}
