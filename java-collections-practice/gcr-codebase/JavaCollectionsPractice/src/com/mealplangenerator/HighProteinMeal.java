package com.mealplangenerator;
class HighProteinMeal implements MealPlan {
    public void prepareMeal() {
        System.out.println("Preparing High Protein Meal: Chicken, Lentils, Eggs");
    }
    public String getMealType() {
        return "High Protein";
    }
}