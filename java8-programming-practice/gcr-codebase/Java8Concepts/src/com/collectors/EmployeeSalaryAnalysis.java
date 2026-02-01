package com.collectors;
import java.util.*;
import java.util.stream.*;

class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryAnalysis {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT", 60000),
                new Employee("Neha", "HR", 45000),
                new Employee("Raj", "IT", 70000),
                new Employee("Priya", "Finance", 80000),
                new Employee("Karan", "HR", 50000));

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg));
    }
}
