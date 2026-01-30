package com.interfaceimplementation.digitalpaymentinterface;
public class PaymentApp{
    public static void main(String[] args){
    	
    	// Creating instances of different payment methods
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        // Making payments using different methods
        p1.pay(500);
        p2.pay(1200);
        p3.pay(300);
    }
}
