package com.dungnv.designpattern.chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	
	/*
	 * Chain of Responsibility
	 * 
	 * */
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Server server;
	
	
	private static void init() {
		server = new Server();
		server.register("admin@domain.com", "Admin123");
		server.register("user@domain.com", "User123");
		
		MiddleWare middleware = new ThrottlingMiddleware(2);
		middleware.linkWith(new UserExistMiddleWare(server))
		.linkWith(new RoleCheckMiddleWare());
	
		server.setMiddleware(middleware);
	}
	
	
	public static void main(String[] args) throws IOException {
		init();
		boolean success;
		do {
			System.out.println("Enter email");
			String email = reader.readLine();
			
			System.out.println("Enter password");
			String pwd = reader.readLine();
			
			success = server.logIn(email, pwd);
			
		} while (!success);

	}

}
