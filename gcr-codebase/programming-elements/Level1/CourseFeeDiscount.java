// Program to calculate discount and final fee
public class CourseFeeDiscount
{  
    public static void main(String[] args)
    {
        //declare and initialize variables
        int fee = 125000;
        int discountPercent = 10;
        
        double discount = fee * discountPercent / 100; //calculating discount
        double finalFee = fee - discount;               //calculating final fee
        
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee); //Display the result
    }
}
