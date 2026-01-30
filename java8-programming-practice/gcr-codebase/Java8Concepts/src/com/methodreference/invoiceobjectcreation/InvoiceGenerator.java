package com.methodreference.invoiceobjectcreation;
import java.util.Arrays;
import java.util.List;

public class InvoiceGenerator{

    public static void main(String[] args){

        List<String> transactionIds = Arrays.asList("TXN1001","TXN1002","TXN1003");

        // Constructor reference without collect()
        transactionIds.stream()
                .map(Invoice::new)
                .forEach(inv -> System.out.println("Invoice created for: " + inv.getTransactionId()));
    }
}