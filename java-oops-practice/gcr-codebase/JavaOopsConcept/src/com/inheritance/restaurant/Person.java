package com.inheritance.restaurant;

class Person {
    protected String name;
    protected int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

