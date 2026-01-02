package com.universityenrollment;

public class UniversitySystem {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Utkarsh");
        Course c1 = new Course("CS101", "OOP in Java");

        Enrollment e1 = new Enrollment(s1, c1);
        e1.assignGrade("A");

        System.out.println(s1.getTranscript());
    }
}
