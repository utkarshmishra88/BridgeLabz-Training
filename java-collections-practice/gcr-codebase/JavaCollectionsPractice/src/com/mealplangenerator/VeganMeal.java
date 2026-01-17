package com.mealplangenerator;
class VeganMeal implements MealPlan {
    public void prepareMeal() {
        System.out.println("Preparing Vegan Meal: Tofu, Beans, Salad");
    }
    public String getMealType() {
        return "Vegan";
    }
}