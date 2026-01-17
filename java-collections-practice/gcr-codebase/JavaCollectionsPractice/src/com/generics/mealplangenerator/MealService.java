package com.generics.mealplangenerator;
class MealService {

    public static <T extends MealPlan> void generatePersonalizedMeal(T mealPlan) {
        System.out.println("Validating meal plan...");
        System.out.println("Meal validated: " + mealPlan.getMealType());
        mealPlan.prepareMeal();
    }
}
