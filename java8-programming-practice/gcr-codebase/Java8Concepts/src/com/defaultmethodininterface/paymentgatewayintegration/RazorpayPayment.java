package com.defaultmethodininterface.paymentgatewayintegration;
public class RazorpayPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Razorpay Payment successful: " + amount);
    }

    // Custom implementation
    @Override
    public void refund(double amount) {
        System.out.println("Instant Razorpay refund processed: " + amount);
    }
}
