package com.encapsulationandpolymorphism.librarymanagement;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

