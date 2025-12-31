package com.objectmodelling;

import java.util.ArrayList;

class School {
    private String schoolName;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

