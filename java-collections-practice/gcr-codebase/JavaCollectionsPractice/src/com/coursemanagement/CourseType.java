package com.coursemanagement;
abstract class CourseType {

    protected String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void evaluate();

    public String getCourseName() {
        return courseName;
    }
}
