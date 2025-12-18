//program to find multiples of a number below 100
import java.util.Scanner;

public class MultiplesBelowHundred
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	//check positive integer and less than 100
	if(number>0 && number<100)
	{
	    //loop backward from 100 to 1
	    for(int i=100;i>=1;i--)
	    {
		if(i%number==0)
		{
		    System.out.println(i);
		}
	    }
	}

	input.close();  //closing input stream
    }
}
