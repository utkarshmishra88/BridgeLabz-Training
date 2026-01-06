package com.fittrack;

abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // in minutes
    protected int caloriesBurned;

    private String workoutLog; // restricted access

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.workoutLog = "Internal workout log";
    }

    public abstract void calculateCalories(double weight);

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}

