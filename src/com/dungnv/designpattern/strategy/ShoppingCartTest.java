package com.dungnv.designpattern.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {

		ShoppingCart sc = new ShoppingCart();
		sc.addItem(new Item("Item 1",5));
		sc.addItem(new Item("Item 2", 43));
		
		sc.pay(new PaypalMethod("user1@gmail.com", "12345"));
		sc.pay(new CreditCardMethod("USER2", 1243454454, 124, "1/1/2020"));
		
		
	}

}
