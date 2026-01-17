package com.generics.mealplangenerator;
class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        mealPlan.prepareMeal();
    }
}
