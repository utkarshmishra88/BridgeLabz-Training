package com.constructor.level1;

//Base class representing a Student
public class Student {

// Public variable 
public int rollNumber;

// Protected variable 
protected String name;

// Private variable 
private double cgpa;

// Constructor to initialize student details
public Student(int rollNumber, String name, double cgpa) {
   this.rollNumber = rollNumber;
   this.name = name;
   this.cgpa = cgpa;
}

// Public getter method to access private CGPA
public double getCgpa() {
   return cgpa;
}

// Public setter method to modify private CGPA
public void setCgpa(double cgpa) {
   if (cgpa >= 0 && cgpa <= 10) {
       this.cgpa = cgpa;
   } else {
       System.out.println("Invalid CGPA value");
   }
}

// Method to display student details
public void displayStudentDetails() {
   System.out.println("Roll Number : " + rollNumber);
   System.out.println("Name        : " + name);
   System.out.println("CGPA        : " + cgpa);
}
}

