package com.markerinterface.backupdataserialization;
public class Invoice implements Backupable {

    private int invoiceId;

    public Invoice(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + invoiceId;
    }
}
