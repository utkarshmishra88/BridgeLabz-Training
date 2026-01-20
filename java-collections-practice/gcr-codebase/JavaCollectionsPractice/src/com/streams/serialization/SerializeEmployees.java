package com.streams.serialization;
import java.io.*;
import java.util.*;

public class SerializeEmployees {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Utkarsh", "IT", 60000));
        employees.add(new Employee(2, "Amit", "HR", 45000));
        employees.add(new Employee(3, "Neha", "Finance", 55000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.dat"))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
