package com.objectmodelling;

public class Composition {
    public static void main(String[] args) {

        Company company = new Company("TechNova");

        Department dev = new Department("Development");
        dev.addEmployee(101, "Utkarsh");
        dev.addEmployee(102, "Aman");

        Department hr = new Department("HR");
        hr.addEmployee(201, "Neha");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayCompany();

        // Composition effect
        company.deleteCompany();
    }
}

