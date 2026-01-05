package com.swiftcart;

class PerishableProduct extends Product {

    private String expiryDate;

    public PerishableProduct(String name, double price, int quantity, String expiryDate) {
        super(name, price, "Perishable", quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount(double total) {
        // 10% discount on perishables
        return total * 0.10;
    }
}
