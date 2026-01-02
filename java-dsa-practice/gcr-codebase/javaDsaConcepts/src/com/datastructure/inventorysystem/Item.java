package com.datastructure.inventorysystem;

class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;

    Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

