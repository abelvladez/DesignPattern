package com.dungnv.designpattern.observer;

public class RuralCustomer extends Customer {

	public RuralCustomer(Book book) {
		this.book = book;
		this.book.attach(this);
	}
	@Override
	public void update() {
		System.out.println("You can get the book at the store now, book Name: " + book.getBookName());
	}

}
