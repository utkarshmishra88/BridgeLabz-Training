//Java program to take a number as input and reverse the number.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take user input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long tempNum = Math.abs(number); // Use absolute value to handle negatives
        
        // 2. Find the count of digits
        int count = 0;
        long tempForCount = tempNum;
        if (tempForCount == 0) count = 1;
        while (tempForCount > 0) {
            tempForCount /= 10;
            count++;
        }

        // 3. Find the digits and save them in an array
        int[] digits = new int[count];
        tempForCount = tempNum;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(tempForCount % 10);
            tempForCount /= 10;
        }

        // 4. Create an array to store elements in reverse order
        int[] reversedArray = new int[count];
        for (int i = 0; i < count; i++) {
            reversedArray[i] = digits[count - 1 - i];
        }

        // 5. Display the reversed array
        System.out.print("Reversed Number: ");
        if (number < 0) System.out.print("-"); // Add minus sign back if negative
        for (int digit : reversedArray) {
            System.out.print(digit);
        }
        
        sc.close();
    }
}