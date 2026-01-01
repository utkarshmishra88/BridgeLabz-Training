package com.objectmodelling;

import java.util.ArrayList;

class Course1 {
    private String courseName;
    private Professor professor;   // Aggregation
    private ArrayList<Student1> students = new ArrayList<>();

    public Course1(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " +
                (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        
        for (Student1 s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

