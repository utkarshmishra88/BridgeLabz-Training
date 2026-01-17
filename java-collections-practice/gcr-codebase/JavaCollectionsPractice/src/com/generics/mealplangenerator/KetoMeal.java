package com.generics.mealplangenerator;
class KetoMeal implements MealPlan {
    public void prepareMeal() {
        System.out.println("Preparing Keto Meal: Eggs, Cheese, Avocado");
    }
    public String getMealType() {
        return "Keto";
    }
}