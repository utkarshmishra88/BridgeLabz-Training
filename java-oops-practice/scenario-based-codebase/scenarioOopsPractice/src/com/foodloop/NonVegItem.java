package com.foodloop;
class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public double applyDiscount() {
        return price * 0.05; // 5% discount
    }
}
