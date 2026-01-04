package com.linkedlist.inventorysystem;

public class InventoryApp {
    public static void main(String[] args) {

        InventoryList inventory = new InventoryList();

        inventory.addAtEnd(101, "Laptop", 5, 50000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

        System.out.println("Inventory:");
        inventory.displayAll();

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(102, 25);

        System.out.println("\nSearch by Name:");
        inventory.searchByName("Laptop");

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSort by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.displayAll();

        System.out.println("\nRemove Item:");
        inventory.removeById(101);
        inventory.displayAll();
    }
}
