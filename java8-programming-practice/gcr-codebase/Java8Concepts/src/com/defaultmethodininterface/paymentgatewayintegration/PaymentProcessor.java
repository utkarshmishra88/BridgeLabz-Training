package com.defaultmethodininterface.paymentgatewayintegration;

public interface PaymentProcessor {

    void pay(double amount);

    // NEW method added later (backward compatible)
    default void refund(double amount) {
        System.out.println("Refund initiated: " + amount);
        System.out.println("Refund will be processed in 5-7 business days.");
    }
}
