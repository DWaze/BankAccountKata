package com.company.account;

import com.company.transactions.Transaction;
import com.company.transactions.TransactionsHistory;

public class Account {
    private String firstName;
    private String lastName;
    private String secretCode;
    private Balance balance;
    private TransactionsHistory transactionsHistory;

    public Account() {
        this.balance = Balance.getAccBalance();
        this.transactionsHistory = TransactionsHistory.getTsHistory();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public TransactionsHistory getTransactionsHistory() {
        return transactionsHistory;
    }

    public void setTransactionsHistory(TransactionsHistory transactionsHistory) {
        this.transactionsHistory = transactionsHistory;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public Balance getBalance() {
        return balance;
    }

    public StringBuilder showTransactions() {
        StringBuilder transHistory = new StringBuilder("Total Balance: " + balance.getAmount() +
                "\n" + "Date | Amount | Transaction \n");
        for (Transaction transaction : transactionsHistory.getTransactionsHistory()) {
            transHistory.append("").
                    append(transaction.getTransactionDate()).
                    append(" | ").append(transaction.getAmount()).
                    append(" | ").append(transaction.getTransactionType()).append("\n");
        }
        return transHistory;
    }
}
