package com.mealplangenerator;
class VegetarianMeal implements MealPlan {
    public void prepareMeal() {
        System.out.println("Preparing Vegetarian Meal: Paneer, Vegetables, Rice");
    }
    public String getMealType() {
        return "Vegetarian";
    }
}