// Program to calculate discount and final fee using user input
import java.util.Scanner;

public class UserFeeDiscount
{  
    public static void main(String[] args)
    {
        //declare variables
        double fee;
        double discountPercent;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        fee = input.nextDouble();             //taking fee input
        discountPercent = input.nextDouble(); //taking discount percentage input
        
        double discount = fee * discountPercent / 100; //calculating discount
        double finalFee = fee - discount;               //calculating final fee
        
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee); //Display the result
    }
}
