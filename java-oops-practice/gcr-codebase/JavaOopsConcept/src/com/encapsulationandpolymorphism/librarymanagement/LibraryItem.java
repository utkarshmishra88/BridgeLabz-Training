package com.encapsulationandpolymorphism.librarymanagement;

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive data (encapsulation)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration(); // days

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + isAvailable);
    }

    // Encapsulation helpers (protected)
    protected void reserve(String borrower) {
        this.borrowerName = borrower;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }
}

