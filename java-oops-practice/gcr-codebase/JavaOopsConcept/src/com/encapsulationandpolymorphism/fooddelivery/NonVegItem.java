package com.encapsulationandpolymorphism.fooddelivery;

class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 30; // extra per item

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg items";
    }
}

