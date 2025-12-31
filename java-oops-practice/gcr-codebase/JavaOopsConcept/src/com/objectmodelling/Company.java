package com.objectmodelling;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees(); // delete employees
        }
        departments.clear(); // delete departments
        System.out.println("Company, Departments, and Employees deleted");
    }
}
