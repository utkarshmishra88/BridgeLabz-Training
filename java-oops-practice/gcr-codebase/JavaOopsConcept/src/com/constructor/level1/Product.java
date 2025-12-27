package com.constructor.level1;

public class Product {

    // Instance variables 
    private String productName;
    private double price;

    // Class variable 
    private static int totalProducts = 0;

    // Default constructor
    public Product() {
        totalProducts++; 
    }

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("---------------------------");
    }

    // Class (static) method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }


    public static void main(String[] args) {

        // Creating Product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 25000);
        Product p3 = new Product("Headphones", 3000);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}
