package com.swiftcart;

class NonPerishableProduct extends Product {

    private int warrantyMonths;

    public NonPerishableProduct(String name, double price, int quantity, int warrantyMonths) {
        super(name, price, "Non-Perishable", quantity);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateDiscount(double total) {
        // 5% discount on non-perishables
        return total * 0.05;
    }
}


