package com.inheritance.library;

public class LibraryTest {

    public static void main(String[] args) {

        Book book = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java and API design"
        );

        book.displayInfo();
    }
}

