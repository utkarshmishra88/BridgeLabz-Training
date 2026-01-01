package com.encapsulationandpolymorphism.librarymanagement;

class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            reserve(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

