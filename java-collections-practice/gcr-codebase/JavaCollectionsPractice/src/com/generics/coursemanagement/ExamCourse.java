package com.generics.coursemanagement;
class ExamCourse extends CourseType {

    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated through written exams.");
    }
}
