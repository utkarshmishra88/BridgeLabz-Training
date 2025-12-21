// Java program to create a UnitConvertor utility class using static methods
// to perform different unit conversions.

public class UnitConvertorMethod {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Main method for testing
    public static void main(String args[]){

        System.out.println("5 yards = " + convertYardsToFeet(5) + " feet");
        System.out.println("9 feet = " + convertFeetToYards(9) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("20 inches = " + convertInchesToMeters(20) + " meters");
    }
}
