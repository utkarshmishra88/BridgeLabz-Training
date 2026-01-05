package com.swiftcart;

import java.util.Scanner;

public class SwiftCartApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nProduct " + i);
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            System.out.print("Type (1-Perishable, 2-NonPerishable): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                System.out.print("Enter expiry date: ");
                String expiry = sc.nextLine();
                cart.addProduct(new PerishableProduct(name, price, qty, expiry));
            } else {
                System.out.print("Enter warranty months: ");
                int warranty = sc.nextInt();
                sc.nextLine();
                cart.addProduct(new NonPerishableProduct(name, price, qty, warranty));
            }
        }

        System.out.print("\nEnter coupon amount: ");
        double coupon = sc.nextDouble();

        cart.applyDiscount(coupon);
        cart.generateBill();

        sc.close();
    }
}
