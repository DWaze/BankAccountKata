package com.company.transactions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime transactionDate;
    private int amount;
    private TransactionType transactionType;

    public Transaction(LocalDateTime transactionDate, int amount, TransactionType transactionType) {
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
