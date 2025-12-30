package com.objectmodelling;

public class AggregationBookLibrary {

    public static void main(String[] args) {

        // Creating Book objects (independent)
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Effective Java", "Utkarsh");
        Book book3 = new Book("Clean Code", "Yashu");

        // Creating Library objects
        Library cityLibrary = new Library("Maharani");
        Library collegeLibrary = new Library("College Library");

        // Adding books to libraries
        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        collegeLibrary.addBook(book2); // same book in another library
        collegeLibrary.addBook(book3);

        // Display books
        cityLibrary.displayLibraryBooks();
        collegeLibrary.displayLibraryBooks();
    }
}
