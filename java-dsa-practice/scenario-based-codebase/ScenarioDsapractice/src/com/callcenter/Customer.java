package com.callcenter;

public class Customer {
	private String customerId;
    private boolean isVIP;

    public Customer(String customerId, boolean isVIP) {
        this.customerId = customerId;
        this.isVIP = isVIP;
    }

    public String getCustomerId() {
        return customerId;
    }

    public boolean isVIP() {
        return isVIP;
    }
}
