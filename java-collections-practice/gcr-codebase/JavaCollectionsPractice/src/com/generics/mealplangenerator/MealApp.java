package com.generics.mealplangenerator;
public class MealApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        vegMeal.generateMeal();
        veganMeal.generateMeal();

        System.out.println("\n--- Using Generic Method ---");
        MealService.generatePersonalizedMeal(new KetoMeal());
        MealService.generatePersonalizedMeal(new HighProteinMeal());
    }
}
