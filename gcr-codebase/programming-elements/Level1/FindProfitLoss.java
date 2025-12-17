// Program to calculate the profit and loss in number and percentage 
public class FindProfitLoss
{  
    public static void main(String[] args)
    {
	//declare and initialize variables
	int costPrice=129;
	int sellingPrice=191;
	
	double profit=sellingPrice-costPrice; //calculating profit
	double profitPercentage=profit/costPrice*100; //calculating profit percentage
	
	System.out.println("The Cost Price is INR "+ costPrice+" and Selling Price is INR "+sellingPrice+
			   " \nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);    //Display the result
	
	
    }


}
