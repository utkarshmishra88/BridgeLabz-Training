package com.generics.onlinemarketplace;
import java.util.Scanner;

public class MarketplaceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductCatalog catalog = new ProductCatalog();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter product type (1-Book, 2-Clothing, 3-Gadget): ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            switch (choice) {

                case 1:
                    Product<BookCategory> book =
                        new Product<>(name, price, new BookCategory());
                    DiscountService.applyDiscount(book, discount);
                    catalog.addProduct(book);
                    break;

                case 2:
                    Product<ClothingCategory> clothing =
                        new Product<>(name, price, new ClothingCategory());
                    DiscountService.applyDiscount(clothing, discount);
                    catalog.addProduct(clothing);
                    break;

                case 3:
                    Product<GadgetCategory> gadget =
                        new Product<>(name, price, new GadgetCategory());
                    DiscountService.applyDiscount(gadget, discount);
                    catalog.addProduct(gadget);
                    break;

                default:
                    System.out.println("Invalid product type!");
            }
        }

        catalog.displayCatalog();
        sc.close();
    }
}
