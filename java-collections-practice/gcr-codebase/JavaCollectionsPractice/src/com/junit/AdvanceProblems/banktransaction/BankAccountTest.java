package com.junit.AdvanceProblems.banktransaction;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance(), 0);
    }

    @Test(expected = RuntimeException.class)
    public void testWithdrawInsufficientFunds() {
        account.withdraw(2000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDeposit() {
        account.deposit(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidWithdraw() {
        account.withdraw(-50);
    }
}
