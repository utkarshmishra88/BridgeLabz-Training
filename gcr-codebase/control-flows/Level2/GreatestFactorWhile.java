//program to find greatest factor using while loop
import java.util.Scanner;

public class GreatestFactorWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	int greatestFactor=1;
	int counter=number-1;

	while(counter>=1)
	{
	    if(number%counter==0)
	    {
		greatestFactor=counter;
		break;
	    }
	    counter--;
	}

	System.out.println(greatestFactor);

	input.close();  //closing input stream
    }
}
