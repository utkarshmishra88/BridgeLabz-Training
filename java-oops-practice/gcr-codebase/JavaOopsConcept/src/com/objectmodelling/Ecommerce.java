package com.objectmodelling;

public class Ecommerce {
    public static void main(String[] args) {

        Customer1 customer = new Customer1(1, "Utkarsh");

        Product p1 = new Product(101, "Laptop", 55000);
        Product p2 = new Product(102, "Mouse", 800);
        Product p3 = new Product(103, "Keyboard", 1500);

        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(1002);
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println();
        customer.viewOrders();
    }
}

