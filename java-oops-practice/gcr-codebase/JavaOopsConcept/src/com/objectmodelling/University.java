package com.objectmodelling;
import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department1> departments = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(Department1 department) {
        departments.add(department);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department1 d : departments) {
            d.displayDepartment();
        }
    }

    public void deleteUniversity() {
        for (Department1 d : departments) {
            d.clearDepartment(); // destroy departments
        }
        departments.clear();
        System.out.println("University deleted with all departments");
    }
}

