package com.objectmodelling;

import java.util.ArrayList;

class Student1 {
    private int rollNo;
    private String name;
    private ArrayList<Course1> courses = new ArrayList<>();

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void enrollCourse(Course1 course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " enrolled courses:");
        for (Course1 c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
