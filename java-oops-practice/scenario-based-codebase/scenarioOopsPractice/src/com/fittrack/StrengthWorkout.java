package com.fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void calculateCalories(double weight) {
        caloriesBurned = (int)(duration * 6 * weight / 70);
    }
}

