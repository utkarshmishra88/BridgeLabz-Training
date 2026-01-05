package com.campusconnect;

class Student extends Person implements ICourseActions {

    private double[] grades; // Encapsulation
    private Course course;

    public Student(int id, String name, String email, double[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    public double calculateGPA() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
        this.course = null;
        System.out.println(name + " dropped the course");
    }

    // Polymorphism
    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}

