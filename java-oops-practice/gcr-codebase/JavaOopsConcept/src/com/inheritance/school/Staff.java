package com.inheritance.school;

class Staff extends Person {
    private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role       : Staff");
        System.out.println("Department : " + department);
    }
}

