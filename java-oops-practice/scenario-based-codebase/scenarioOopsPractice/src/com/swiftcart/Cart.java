package com.swiftcart;
import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Pre-filled cart
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    // Only Cart can update total price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice() * p.getQuantity(); // operator usage
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.calculateDiscount(p.getPrice() * p.getQuantity());
        }

        totalPrice = totalPrice - productDiscount - couponAmount; // operator usage
    }

    @Override
    public void generateBill() {
        System.out.println("\n------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(
                p.name + " | Qty: " + p.quantity + " | Price: " + (p.price * p.quantity)
            );
        }
        System.out.println("Total Payable Amount: ₹" + totalPrice);
    }
}
