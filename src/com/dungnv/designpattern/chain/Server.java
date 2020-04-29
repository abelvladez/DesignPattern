package com.dungnv.designpattern.chain;

import java.util.HashMap;
import java.util.Map;

public class Server {

	
	private Map<String,String>  users = new HashMap<String,String>();
	private MiddleWare middleWare;
	
	public void setMiddleware(MiddleWare middleware) {
		this.middleWare = middleware;
	}
	
	public boolean logIn(String email, String pwd) {
		if(middleWare.check(email, pwd)) {
			System.out.println("Authorization has been succesfully!");
			return true;
		}
		return false;
	}
	
	public void register(String email, String password) {
		users.put(email, password);
	}
	
	public boolean hasEmail(String email) {
		return users.containsKey(email);
	}
	
	public boolean isValidPassword(String email, String pwd) {
		return users.get(email).equals(pwd);
	}
	
}
