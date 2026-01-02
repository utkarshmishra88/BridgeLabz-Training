package com.ewallet;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 50000;

    public PersonalWallet(boolean referral) {
        super(referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded!");
            return;
        }

        if (getBalance() >= amount) {
            deductBalance(amount);
            receiver.getWallet().addBalance(amount);

            transactions.add(new Transaction("Transfer Sent", amount));
            receiver.getWallet().transactions
                    .add(new Transaction("Transfer Received", amount));
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
