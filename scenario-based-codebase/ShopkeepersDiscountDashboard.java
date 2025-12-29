//Java program for shopkeeper discount;
import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Constants for discount rates
    private static final double DISCOUNT20 = 0.20;
    private static final double DISCOUNT10 = 0.10;
    private static final double DISCOUNT5 = 0.05;

    //Main method
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();
        double totalBill = 0.0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalBill += price;
        }
		
        //Compute discount
        double discount = 0.0;
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT20;
        } else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT10;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT5;
        } else {
            discount = 0.0;
        }

        double finalAmount = totalBill - discount;

        System.out.println("\n------ BILL SUMMARY ------");
        System.out.println("Total Bill Amount : " + totalBill);
        System.out.println("Discount Applied  : " + discount);
        System.out.println("Final Payable     : " + finalAmount);

        scanner.close();
    }
}
