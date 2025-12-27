package com.constructor.level1;

public class BookLibraryDriver {

	public static void main(String[] args) {

        // Default Constructor
        BookLibrary book1 = new BookLibrary();
        System.out.println("Book 1:");
        book1.displayBookDetails();

        // Borrow Book
        System.out.println("\nBorrowing Book 1:");
        book1.borrowBook();
        book1.displayBookDetails();

        // Parameterized Constructor
        BookLibrary book2 = new BookLibrary("Computer", "Hemant", 1299.0);
        System.out.println("\nBook 2:");
        book2.displayBookDetails();

        // Borrow Book
        System.out.println("\nBorrowing Book 2:");
        book2.borrowBook();
        book2.displayBookDetails();
    }

}
