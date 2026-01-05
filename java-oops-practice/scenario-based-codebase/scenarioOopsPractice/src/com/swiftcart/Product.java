package com.swiftcart;

abstract class Product {
    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Polymorphic discount
    public abstract double calculateDiscount(double total);
}

