package com.dungnv.designpattern.strategy;

public class CreditCardMethod implements PaymentType {

	private String name;
	private int cardNumber;
	private int CVV;
	private String dateExpire;
	
	public CreditCardMethod(String name, int cardNumber, int cVV, String dateExpire) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.CVV = cVV;
		this.dateExpire = dateExpire;
	}

	@Override
	public void pay(int amount) {
		System.out.println(String.format("Pay using creadit card. Name:%s, Number: %d, CVV: %d, DateExpire:%s", name, cardNumber, CVV, dateExpire));
	}

}
