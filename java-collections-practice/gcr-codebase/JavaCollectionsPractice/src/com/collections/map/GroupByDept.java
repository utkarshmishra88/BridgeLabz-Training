package com.collections.map;
import java.util.*;

class Employee {
    String name, dept;
    Employee(String n, String d) { name = n; dept = d; }
}

public class GroupByDept {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        // group by department
        for (Employee e : list) {
            if (!map.containsKey(e.dept))
                map.put(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }

        // print result
        for (String d : map.keySet()) {
            System.out.print(d + ": ");
            for (Employee e : map.get(d))
                System.out.print(e.name + " ");
            System.out.println();
        }
    }
}
