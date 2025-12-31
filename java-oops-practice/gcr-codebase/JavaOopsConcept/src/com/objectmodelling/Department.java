package com.objectmodelling;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(int empId, String name) {
        employees.add(new Employee(empId, name));
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    public void clearEmployees() {
        employees.clear(); // Employees destroyed
    }
}

