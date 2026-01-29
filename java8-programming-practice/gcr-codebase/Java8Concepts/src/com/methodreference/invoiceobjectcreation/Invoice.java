package com.methodreference.invoiceobjectcreation;

class Invoice{
    private String transactionId;

    // Constructor
    public Invoice(String transactionId){
        this.transactionId =transactionId;
    }

    public String getTransactionId(){
        return transactionId;
    }
}