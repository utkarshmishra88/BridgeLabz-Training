package com.fittrack;
import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User details
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter fitness goal: ");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

        // Workout selection
        System.out.print("Enter workout type (1-Cardio, 2-Strength): ");
        int choice = sc.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        workout.startWorkout();
        workout.calculateCalories(user.getWeight());
        workout.stopWorkout();

        // Operator usage
        int dailyTarget = 500;
        int remainingCalories = dailyTarget - workout.getCaloriesBurned();

        System.out.println("\nCalories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories to Target: " + remainingCalories);

        sc.close();
    }
}
