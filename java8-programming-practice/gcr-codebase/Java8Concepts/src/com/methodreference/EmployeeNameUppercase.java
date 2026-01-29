package com.methodreference;
import java.util.Arrays;
import java.util.List;

public class EmployeeNameUppercase {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList("utkarsh","rahul","neha","priya");

        // Convert to uppercase and print (no collector used)
        employeeNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
