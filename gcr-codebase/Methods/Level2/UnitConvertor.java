// Java program to create a UnitConvertor utility class with static methods
// to convert length units between different measurement systems.

public class UnitConvertor {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method for testing the utility class
    public static void main(String args[]){

        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " km = " + miles + " miles");

        double kmBack = convertMilesToKm(miles);
        System.out.println(miles + " miles = " + kmBack + " km");

        double meters = 5;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters = " + feet + " feet");

        double metersBack = convertFeetToMeters(feet);
        System.out.println(feet + " feet = " + metersBack + " meters");
    }
}
