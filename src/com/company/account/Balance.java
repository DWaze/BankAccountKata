package com.company.account;

import java.time.LocalDateTime;

public class Balance {
    private int amount;
    private static Balance accBalance = null;
    private final LocalDateTime accCreation;


    private Balance() {
        this.amount = 0;
        accCreation = LocalDateTime.now();
    }

    public static Balance getAccBalance() {
        if (accBalance == null) {
            accBalance = new Balance();
        }
        return accBalance;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getAccCreation() {
        return accCreation;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
