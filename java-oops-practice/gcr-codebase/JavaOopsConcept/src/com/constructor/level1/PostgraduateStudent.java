package com.constructor.level1;

//Subclass demonstrating use of protected members
public class PostgraduateStudent extends Student {

// Additional variable for postgraduate student
private String specialization;

// Constructor using super keyword
public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
   super(rollNumber, name, cgpa);
   this.specialization = specialization;
}

// Method accessing protected variable 'name'
public void displayPostgraduateDetails() {
   System.out.println("Postgraduate Student Details");
   System.out.println("-----------------------------");
   System.out.println("Name           : " + name); // protected member
   System.out.println("Specialization : " + specialization);
   System.out.println("CGPA           : " + getCgpa()); // accessed via getter
}

// Main method for testing
public static void main(String[] args) {

   // Creating Student object
   Student student = new Student(101, "Rahul", 8.5);
   student.displayStudentDetails();

   System.out.println();

   // Creating PostgraduateStudent object
   PostgraduateStudent pgStudent =
           new PostgraduateStudent(201, "Anita", 9.1, "Computer Science");

   pgStudent.displayPostgraduateDetails();

   // Modifying CGPA using setter
   pgStudent.setCgpa(9.4);
   System.out.println("\nUpdated CGPA: " + pgStudent.getCgpa());
}
}
