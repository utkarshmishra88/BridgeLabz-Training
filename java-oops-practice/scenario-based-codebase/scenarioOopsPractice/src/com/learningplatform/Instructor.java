package com.learningplatform;

public class Instructor extends User {
	private String expertise;

	Instructor(int userID, String name, String email, String expertise) {
		super(userID, name, email);
		this.expertise=expertise;
	}
	
	public void manageCourse() {
		System.out.println(name + " is managing the course in " + expertise);
	}

}
