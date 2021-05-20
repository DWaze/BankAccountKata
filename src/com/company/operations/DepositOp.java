package com.company.operations;

import com.company.account.Account;
import com.company.account.Balance;
import com.company.transactions.Transaction;
import com.company.transactions.TransactionType;
import com.company.transactions.TransactionsHistory;

import java.time.LocalDateTime;

public class DepositOp implements AccountOp{

    @Override
    public TransactionMessages makeTransaction(int depositAmount, Account account) {
        account.getBalance().setAmount(account.getBalance().getAmount()+depositAmount);
        Transaction transaction= new Transaction(LocalDateTime.now(), depositAmount, TransactionType.DEPOSIT);
        account.getTransactionsHistory().addTransaction(transaction);
        return TransactionMessages.DEPOSIT_SUCCESSFUL;
    }
}
