package com.objectmodelling;

public class SchoolAssociation {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student(1, "Utkarsh");
        Student s2 = new Student(2, "Aman");

        Course java = new Course("Java");
        Course python = new Course("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(java);
        s1.enrollCourse(python);
        s2.enrollCourse(java);

        s1.viewCourses();
        s2.viewCourses();

        java.showEnrolledStudents();
        python.showEnrolledStudents();
    }
}

