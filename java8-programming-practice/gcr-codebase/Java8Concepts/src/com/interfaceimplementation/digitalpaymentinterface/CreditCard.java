package com.interfaceimplementation.digitalpaymentinterface;
class CreditCard implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}
