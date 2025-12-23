// Program to check palindrome

import java.util.Scanner;

public class PalindromeCheck {

    //  start-end comparison
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
           //initialise variable
		    String text;
		
		  //create scanner object 
        Scanner input = new Scanner(System.in);
 
         //take input from users
        System.out.print("Enter text: ");
         text = input.next();
		 
        //display the result
        System.out.println(isPalindrome(text));
        
		
		//close the scanner
        input.close();
    }
}
