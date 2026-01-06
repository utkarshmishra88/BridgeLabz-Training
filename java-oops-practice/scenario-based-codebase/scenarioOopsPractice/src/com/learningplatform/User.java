package com.learningplatform;

public class User {
	// attributes
	protected int userID;
	protected String name;
	private String email;
	
	User(int userID, String name, String email ){
		this.userID=userID;
		this.name=name;
		this.email=email;
	}
		
		public void getUserDetails() {
	        System.out.println("User ID : " + userID);
	        System.out.println("Name    : " + name);
	        System.out.println("Email   : " + email);
	    }
	
}
