package com.defaultmethodininterface.paymentgatewayintegration;
public class PayPalPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("PayPal Payment successful: " + amount);
    }
}
