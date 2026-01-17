package com.coursemanagement;
import java.util.List;

class CourseManager {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println("Course: " + c.getCourseName());
            c.evaluate();
        }
    }
}
