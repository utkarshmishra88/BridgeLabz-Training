package com.sorting.tailorshop;
class Order {
    int orderId;
    int deadline; // delivery deadline (smaller = earlier)

    Order(int orderId, int deadline) {
        this.orderId = orderId;
        this.deadline = deadline;
    }
}