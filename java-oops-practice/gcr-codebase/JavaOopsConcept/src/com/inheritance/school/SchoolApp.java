package com.inheritance.school;

public class SchoolApp {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Riya", 16, "10th");
        Person p3 = new Staff("Anil", 35, "Administration");

        p1.displayPersonInfo();
        p1.displayRole();
        System.out.println();

        p2.displayPersonInfo();
        p2.displayRole();
        System.out.println();

        p3.displayPersonInfo();
        p3.displayRole();
    }
}

