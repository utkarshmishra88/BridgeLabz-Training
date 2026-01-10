package com.foodloop;
class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public double applyDiscount() {
        return price * 0.10; // 10% discount
    }
}
