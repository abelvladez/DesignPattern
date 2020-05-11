package com.dungnv.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<Customer> customerList = new ArrayList<Customer>();
	private boolean hasNewBook;
	private String bookName;
	
	public void setBookName(String name) {
		this.bookName = name;
	}
	
	
	public boolean isHasNewBook() {
		return hasNewBook;
	}


	public void setHasNewBook(boolean hasNewBook) {
		this.hasNewBook = hasNewBook;
		notifyAllCustomers();
	}


	public String getBookName() {
		return bookName;
	}

	
	public void attach(Customer customer) {
		customerList.add(customer);
	}
	
	public void notifyAllCustomers() {
		for(Customer customer:customerList) {
			if(hasNewBook) {
				customer.update();	
			}
		}
	}
	
}
