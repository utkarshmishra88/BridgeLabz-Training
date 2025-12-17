// Program to convert kilometers to miles
import java.util.Scanner;

public class KmToMiles
{  
    public static void main(String[] args)
    {
        //declare variables
        double km;
        double miles;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        km = input.nextInt(); //taking user input
        
        miles = km / 1.6; //converting km to miles
        
        System.out.println("The total miles is " + miles +
                           " mile for the given " + km + " km"); //Display the result
    }
}
