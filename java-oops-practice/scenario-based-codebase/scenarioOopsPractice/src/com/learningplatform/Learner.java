package com.learningplatform;

public class Learner extends User implements ICertifiable {
	private int enrolledCourse;
	private double percentage;

	Learner(int userID, String name, String email, int enrolledCourse) {
		super(userID, name, email);
		this.enrolledCourse=enrolledCourse;
	}
	
	public void setPercentage(double percentage) {
		this.percentage=percentage;
	}
	
	public void generateCertificate() {
		System.out.println("\n---- CERTIFICATE ----");
        System.out.println("Learner Name: " + name);

        if (enrolledCourse == 1) {
            System.out.println("Course Type  : Part-Time Course");
            System.out.println("Certificate  : Part-Time Course Completion Certificate");
        } else if (enrolledCourse == 2) {
            System.out.println("Course Type  : Full-Time Course");
            System.out.println("Certificate  : Full-Time Professional Certificate");
        } else {
            System.out.println("Invalid Course Type");
        }
        System.out.println("Score Percentage: " + percentage + "%");
        System.out.println("---------------------");
    }
		
	}


