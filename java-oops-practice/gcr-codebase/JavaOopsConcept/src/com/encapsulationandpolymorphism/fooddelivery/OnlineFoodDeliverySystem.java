package com.encapsulationandpolymorphism.fooddelivery;
import java.util.*;

public class OnlineFoodDeliverySystem {

    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable discountable) {
                discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("----------------------------------");
        }

        System.out.println("Grand Total Bill: ₹" + grandTotal);
    }

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));
        order.add(new VegItem("Butter Naan", 40, 4));

        processOrder(order);
    }
}

