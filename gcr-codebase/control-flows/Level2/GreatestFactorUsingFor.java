//program to find greatest factor using for loop
import java.util.Scanner;

public class GreatestFactorFor
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	int greatestFactor=1;

	for(int i=number-1;i>=1;i--)
	{
	    if(number%i==0)
	    {
		greatestFactor=i;
		break;
	    }
	}

	System.out.println(greatestFactor);

	input.close();  //closing input stream
    }
}
