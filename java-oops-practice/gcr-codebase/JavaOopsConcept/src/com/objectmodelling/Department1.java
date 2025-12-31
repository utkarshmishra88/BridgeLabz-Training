package com.objectmodelling;
import java.util.ArrayList;

class Department1 {
    private String deptName;
    private ArrayList<Faculty> facultyList = new ArrayList<>();

    public Department1(String deptName) {
        this.deptName = deptName;
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty); // Aggregation
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            System.out.println("- " + f.getName());
        }
    }

    public void clearDepartment() {
        facultyList.clear(); // Faculty still exists elsewhere
        System.out.println(deptName + " department deleted");
    }
}
