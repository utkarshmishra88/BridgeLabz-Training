// program to find maximum number of handshakes
public class HandShakes
{
    public static void main(String[] args)
    {
	//declare variables
	int numberOfStudents;
	
	Scanner input=new Scanner(System.in);  //Scanner object
	
	numberOfStudents=input.nextInt();      //taking number Of Student input

	int handShakes=(numberOfStudents*(numberOfStudents-1))/2;  //calculating handshakes

	System.out.println("The maximum number of handshakes possible is " + handshakes); //Display the result
    }	
}