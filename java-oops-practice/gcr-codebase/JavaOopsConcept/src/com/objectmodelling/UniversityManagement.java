package com.objectmodelling;

public class UniversityManagement {
    public static void main(String[] args) {

        Student1 s1 = new Student1(1, "Utkarsh");
        Student1 s2 = new Student1(2, "Aman");

        Professor p1 = new Professor(101, "Dr. Sharma");

        Course1 java = new Course1("Java Programming");
        Course1 dbms = new Course1("DBMS");

        s1.enrollCourse(java);
        s1.enrollCourse(dbms);
        s2.enrollCourse(java);

        p1.assignProfessor(java);

        s1.viewCourses();
        s2.viewCourses();

        java.showCourseDetails();
        dbms.showCourseDetails();
    }
}
