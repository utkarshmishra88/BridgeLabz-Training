package com.inheritance.restaurant;

public class RestaurantApp {
    public static void main(String[] args) {

        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 201);

        ((Person) w1).displayInfo();
        w1.performDuties();
        System.out.println();

        ((Person) w2).displayInfo();
        w2.performDuties();
    }
}

