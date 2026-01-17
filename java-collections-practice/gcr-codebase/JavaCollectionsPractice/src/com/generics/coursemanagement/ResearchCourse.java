package com.generics.coursemanagement;
class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated through research work.");
    }
}