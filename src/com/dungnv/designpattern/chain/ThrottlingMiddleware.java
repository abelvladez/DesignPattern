package com.dungnv.designpattern.chain;

public class ThrottlingMiddleware extends MiddleWare {
	private int requestPerMinute;
	private int request;
	private long currentTime;
	
	public ThrottlingMiddleware(int requestPerMinute) {
		this.requestPerMinute = requestPerMinute;
		this.currentTime = System.currentTimeMillis();
	}
	
	@Override
	public boolean check(String email, String password) {
		
		if(System.currentTimeMillis() > currentTime + 60000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		
		request++;
		
		if(request > requestPerMinute) {
			System.out.println("Request limit exceeded!");
		}
		
		return checkNext(email, password);
	}

}