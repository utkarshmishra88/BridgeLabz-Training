package com.inheritance.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Manager("Rohit", 101, 90000, 8);
        Employee e2 = new Developer("Anita", 102, 70000, "Java");
        Employee e3 = new Intern("Aman", 103, 15000, 6);

        e1.displayDetails();
        System.out.println("----------------------");

        e2.displayDetails();
        System.out.println("----------------------");

        e3.displayDetails();
    }
}

