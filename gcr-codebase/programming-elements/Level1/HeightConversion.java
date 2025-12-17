// Program to convert height from centimeters to feet and inches
import java.util.Scanner;

public class HeightConversion
{  
    public static void main(String[] args)
    {
        //declare variables
        double heightCm;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        heightCm = input.nextDouble(); //taking user input
        
        double totalInches = heightCm / 2.54; //convert cm to inches
        int feet = (int)(totalInches / 12);   //calculating feet
        double inches = totalInches % 12;     //calculating remaining inches
        
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches); //Display the result
    }
}
