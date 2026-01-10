package com.foodloop;
import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Constructor for combo meal
    public Order(List<FoodItem> comboItems) {
        this.items = comboItems;
    }

    public void calculateTotal() {
        total = 0;
        double discount = 0;

        for (FoodItem item : items) {
            total += item.getPrice();
            discount += item.applyDiscount();
        }

        // Extra discount based on order total (polymorphism)
        if (total > 500) {
            discount += 50;
        }

        total = total - discount;
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total Payable Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
