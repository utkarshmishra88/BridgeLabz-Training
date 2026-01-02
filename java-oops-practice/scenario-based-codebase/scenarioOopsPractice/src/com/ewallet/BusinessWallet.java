package com.ewallet;

class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet(boolean referral) {
        super(referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (getBalance() >= totalDeduction) {
            deductBalance(totalDeduction);
            receiver.getWallet().addBalance(amount);

            transactions.add(new Transaction("Business Transfer (Tax ₹" + tax + ")", amount));
            receiver.getWallet().transactions
                    .add(new Transaction("Transfer Received", amount));
        } else {
            System.out.println("Insufficient balance (including tax)!");
        }
    }
}

