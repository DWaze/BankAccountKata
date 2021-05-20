package com.company.transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionsHistory {

    private static TransactionsHistory transactionsHistory= null;

    private final List<Transaction> transactionsHistories;

    private TransactionsHistory() {
        this.transactionsHistories = new ArrayList<Transaction>();
    }

    public static TransactionsHistory getTsHistory() {
        if (transactionsHistory == null) {
            transactionsHistory = new TransactionsHistory();
        }
        return transactionsHistory;
    }


    public List<Transaction> getTransactionsHistory() {
        return transactionsHistories;
    }

    public void addTransaction(Transaction transaction){
        transactionsHistories.add(transaction);
    }
}
