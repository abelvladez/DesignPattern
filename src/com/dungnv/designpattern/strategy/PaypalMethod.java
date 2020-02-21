package com.dungnv.designpattern.strategy;

public class PaypalMethod implements PaymentType {

	private String email;
	private String pwd;

	public PaypalMethod(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(String.format("Using paypal method with email:%s, Pwd: %s", this.email, this.pwd));
	}

}
