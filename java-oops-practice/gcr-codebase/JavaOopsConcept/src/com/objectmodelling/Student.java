package com.objectmodelling;

import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // two-way association
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
