package com.fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = (int)(duration * 8 * weight / 70);
    }
}

