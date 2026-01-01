package com.encapsulationandpolymorphism.ecommerceplatform;
import java.util.*;

public class ECommercePlatform {

    public static void calculateFinalPrice(List<Product> products) {

        for (Product product : products) {
            double tax = 0;
            if (product instanceof Taxable taxableProduct) {
                tax = taxableProduct.calculateTax();
            }
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            product.displayBasicDetails();
            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics(1, "Laptop", 60000));
        productList.add(new Clothing(2, "Jacket", 3000));
        productList.add(new Groceries(3, "Rice Bag", 1200));

        calculateFinalPrice(productList);
    }
}

