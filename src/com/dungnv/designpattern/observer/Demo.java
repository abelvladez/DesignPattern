package com.dungnv.designpattern.observer;

public class Demo {

	public static void main(String[] args) {
		Book book = new Book();
		book.setBookName("Leonardo De Vinci");
		
		new EmailCustomer(book);
		new RuralCustomer(book);
		
		
		book.setHasNewBook(true);
		book.setHasNewBook(false);
	}

}
