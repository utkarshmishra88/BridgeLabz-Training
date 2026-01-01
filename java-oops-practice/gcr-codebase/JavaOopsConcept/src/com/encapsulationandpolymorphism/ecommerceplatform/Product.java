package com.encapsulationandpolymorphism.ecommerceplatform;

abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Encapsulation (Getters & Setters)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Concrete method
    public void displayBasicDetails() {
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: ₹" + price);
    }
}

