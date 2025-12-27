package com.constructor.level1;

public class Course {

    // Instance variables 
    private String courseName;
    private int duration;   // duration in months
    private double fee;

    // Class variable 
    private static String instituteName = "Global Tech Academy";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println("-----------------------------");
    }

    // Class (static) method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the program
    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("Core Java", 3, 15000);
        Course c2 = new Course("Full Stack Development", 6, 45000);

        // Display course details before update
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name using class method
        Course.updateInstituteName("NextGen IT Institute");

        // Display course details after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
