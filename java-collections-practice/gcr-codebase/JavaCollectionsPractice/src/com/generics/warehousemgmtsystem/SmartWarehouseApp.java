package com.generics.warehousemgmtsystem;
import java.util.Scanner;

public class SmartWarehouseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        while (true) {
            System.out.println("\n--- Smart Warehouse Menu ---");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Groceries");
            System.out.println("3. Add Furniture");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 5) {
                System.out.println("Exiting system...");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Electronics ID: ");
                    String eId = sc.nextLine();
                    System.out.print("Enter Electronics Name: ");
                    String eName = sc.nextLine();
                    electronicsStorage.addItem(new Electronics(eId, eName));
                    System.out.println("Electronics item added.");
                    break;

                case 2:
                    System.out.print("Enter Grocery ID: ");
                    String gId = sc.nextLine();
                    System.out.print("Enter Grocery Name: ");
                    String gName = sc.nextLine();
                    groceriesStorage.addItem(new Groceries(gId, gName));
                    System.out.println("Grocery item added.");
                    break;

                case 3:
                    System.out.print("Enter Furniture ID: ");
                    String fId = sc.nextLine();
                    System.out.print("Enter Furniture Name: ");
                    String fName = sc.nextLine();
                    furnitureStorage.addItem(new Furniture(fId, fName));
                    System.out.println("Furniture item added.");
                    break;

                case 4:
                    System.out.println("\n--- Electronics ---");
                    WarehouseUtil.displayItems(electronicsStorage.getAllItems());

                    System.out.println("\n--- Groceries ---");
                    WarehouseUtil.displayItems(groceriesStorage.getAllItems());

                    System.out.println("\n--- Furniture ---");
                    WarehouseUtil.displayItems(furnitureStorage.getAllItems());
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
