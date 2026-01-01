package com.inheritance.employee;

public class Intern extends Employee {

    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role            : Intern");
        System.out.println("Internship Term : " + durationMonths + " months");
    }
}

