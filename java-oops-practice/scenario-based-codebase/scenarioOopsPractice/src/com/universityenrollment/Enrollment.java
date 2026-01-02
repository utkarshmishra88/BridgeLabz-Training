package com.universityenrollment;

class Enrollment {
    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void assignGrade(String grade) {
        this.grade = grade;

        // GPA calculation using operators
        if (grade.equals("A")) student.setGpa(4.0);
        else if (grade.equals("B")) student.setGpa(3.0);
        else student.setGpa(2.0);
    }
}

