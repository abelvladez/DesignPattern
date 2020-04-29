package com.dungnv.designpattern.chain;

public class UserExistMiddleWare extends MiddleWare {
	private Server server;
	
	public UserExistMiddleWare(Server server) {
		this.server = server;
	}
	@Override
	public boolean check(String email, String password) {
		
		if(!server.hasEmail(email)) {
			System.out.println("This email is not registered yet!");
			return false;
		}
		
		if(!server.isValidPassword(email, password)) {
			System.out.println("Wrong password");
			return false;
		}
		
		return checkNext(email, password);
	}

}
