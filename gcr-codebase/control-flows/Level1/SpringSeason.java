//Java Code to check Spring-Season
public class SpringSeason {
    public static void main(String[] args) {

        // Read month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls in Spring Season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) 
            System.out.println("Its a Spring Season");
		else
            System.out.println("Not a Spring Season");
			
	    		
    }
}