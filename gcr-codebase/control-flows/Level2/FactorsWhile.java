//program to find factors using while loop
import java.util.Scanner;

public class FactorsWhile
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input value
	System.out.print("Enter a number: ");
	int number=input.nextInt();

	int counter=1;

	//find factors
	while(counter<number)
	{
	    if(number%counter==0)
	    {
		System.out.println(counter);
	    }
	    counter++;
	}

	input.close();  //closing input stream
    }
}
