package com.objectmodelling;

import java.util.ArrayList;

class Customer1 {
    private int customerId;
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer1(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Communication method
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order);
    }

    public void viewOrders() {
        System.out.println("Customer: " + name + " Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}
