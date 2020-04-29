package com.dungnv.designpattern.chain;

public class RoleCheckMiddleWare extends MiddleWare {

	
	@Override
	public boolean check(String email, String password) {
		if(email.equals("admin@domain.com")) {
			System.out.println("Hello admin!");
			return true;
		}
		
		System.out.println("Hello user: " + email);
		return checkNext(email, password);
	}

}
