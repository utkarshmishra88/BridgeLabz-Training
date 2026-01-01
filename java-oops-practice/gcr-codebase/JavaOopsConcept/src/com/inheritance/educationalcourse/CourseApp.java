package com.inheritance.educationalcourse;

public class CourseApp {
    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);
        Course c2 = new OnlineCourse("Spring Boot", 60,
                                     "Udemy", true);
        Course c3 = new PaidOnlineCourse("Full Stack Java",
                                         120, "Coursera",
                                         true, 10000, 20);

        c1.displayCourseInfo();
        System.out.println();

        c2.displayCourseInfo();
        System.out.println();

        c3.displayCourseInfo();
    }
}

