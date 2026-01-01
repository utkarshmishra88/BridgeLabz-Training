package com.encapsulationandpolymorphism.librarymanagement;

class Book extends LibraryItem implements Reservable {

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            reserve(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
