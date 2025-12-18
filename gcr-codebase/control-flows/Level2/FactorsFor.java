//program to find factors using for loop
import java.util.Scanner;

public class FactorsFor
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	//find factors
	for(int i=1;i<number;i++)
	{
	    if(number%i==0)
	    {
		System.out.println(i);
	    }
	}

	input.close();  //closing input stream
    }
}
