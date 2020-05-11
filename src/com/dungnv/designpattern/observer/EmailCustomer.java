package com.dungnv.designpattern.observer;

public class EmailCustomer extends Customer {
	public EmailCustomer(Book book) {
		this.book = book;
		this.book.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("You can get the book via Email now, book Name: " + book.getBookName());
	}

}
