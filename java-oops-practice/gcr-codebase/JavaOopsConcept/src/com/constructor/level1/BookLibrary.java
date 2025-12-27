package com.constructor.level1;

public class BookLibrary {

    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default Constructor
    BookLibrary() {
        this.title = "7States";
        this.author = "Vishal";
        this.price = 199.0;
        this.availability = true;
    }

    // Parameterized Constructor
    BookLibrary(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    // Method to Borrow Book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    // Display Book Details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + availability);
    }
}
