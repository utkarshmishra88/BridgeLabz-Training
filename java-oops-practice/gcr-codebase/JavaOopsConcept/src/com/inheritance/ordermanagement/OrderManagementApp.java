package com.inheritance.ordermanagement;

public class OrderManagementApp {
    public static void main(String[] args) {

        Order order1 = new Order(101, "01-Jan-2026");
        Order order2 = new ShippedOrder(102, "02-Jan-2026", "TRK789456");
        Order order3 = new DeliveredOrder(103, "03-Jan-2026",
                                          "TRK123987", "05-Jan-2026");

        order1.displayOrder();
        System.out.println();

        order2.displayOrder();
        System.out.println();

        order3.displayOrder();
    }
}