package com.objectmodelling;

public class UniversityRelation {
    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");

        Department1 cs = new Department1("Computer Science");
        cs.addFaculty(f1);
        cs.addFaculty(f2);

        University uni = new University("Tech University");
        uni.addDepartment(cs);

        uni.displayUniversity();

        // Composition behavior
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("Faculty still exists after university deletion:");
        f1.displayFaculty();
    }
}

