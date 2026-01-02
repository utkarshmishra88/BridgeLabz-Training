package com.universityenrollment;

class Student {
    private int rollNo;
    private String name;
    private double gpa;   // sensitive data

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return "Roll: " + rollNo + ", Name: " + name + ", GPA: " + gpa;
    }
}

