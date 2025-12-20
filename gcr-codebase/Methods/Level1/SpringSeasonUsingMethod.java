//Java program to check Spring Season.
import java.util.Scanner;

public class SpringSeasonUsingMethod{

    //creating method to check Spring-Season.
    public static boolean checkSpring(int month,int day){
	    if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) 
            return true;
		else
            return false;
	}

    //main method	
    public static void main(String args[]){
		
         // Read month and day from command line arguments
         int month = Integer.parseInt(args[0]);
         int day = Integer.parseInt(args[1]);
		 
		 //Print after checking with method.
         if(checkSpring(month,day))
			 System.out.println("Its a Spring Season");
		 else
			 System.out.println("Not a Spring Season");
		 
    }
}		