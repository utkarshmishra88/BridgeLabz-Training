package com.defaultmethodininterface.paymentgatewayintegration;
public class StripePayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Stripe Payment successful: " + amount);
    }
}
