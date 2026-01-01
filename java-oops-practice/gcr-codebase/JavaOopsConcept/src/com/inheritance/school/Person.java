package com.inheritance.school;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public void displayRole() {
        System.out.println("Role : Person");
    }
}

