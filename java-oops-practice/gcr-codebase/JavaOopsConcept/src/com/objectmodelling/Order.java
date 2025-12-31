package com.objectmodelling;

import java.util.ArrayList;

class Order {
    private int orderId;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " : " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: " + total);
    }
}

