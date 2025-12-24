// Program to generate fibonacci series
import java.util.Scanner;

public class GenerateFibonacci {

    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int first = 0;
        int second = 1;
		System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Take user input
        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        generateFibonacci(terms);
       
	   // Closing scanner stream
        input.close();
    }
}
