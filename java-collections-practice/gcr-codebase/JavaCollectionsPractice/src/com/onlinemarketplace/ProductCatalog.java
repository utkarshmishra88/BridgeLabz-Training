package com.onlinemarketplace;
import java.util.*;

class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayCatalog() {
        System.out.println("\n--- Product Catalog ---");
        for (Product<? extends Category> p : products) {
            p.display();
        }
    }
}
