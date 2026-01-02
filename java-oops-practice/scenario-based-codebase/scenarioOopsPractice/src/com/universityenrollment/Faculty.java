package com.universityenrollment;

class Faculty implements Graded {

    @Override
    public void assignGrade(String grade) {
        System.out.println("Faculty assigned grade: " + grade);
    }
}
