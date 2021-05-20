package com.company.operations;

import com.company.account.Account;
import com.company.account.Balance;
import com.company.transactions.Transaction;
import com.company.transactions.TransactionType;
import com.company.transactions.TransactionsHistory;

import java.time.LocalDateTime;

public class WithdrawOp implements AccountOp {

    public WithdrawOp() {
    }

    @Override
    public TransactionMessages makeTransaction(int withdrawAmount, Account account) {
        int balanceAmount = account.getBalance().getAmount();
        if (balanceAmount > withdrawAmount) {
            account.getBalance().setAmount(balanceAmount - withdrawAmount);
            Transaction transaction = new Transaction(
                    LocalDateTime.now(),
                    withdrawAmount,
                    TransactionType.WITHDRAW
            );
            account.getTransactionsHistory().addTransaction(transaction);
            return TransactionMessages.WITHDRAW_SUCCESSFUL;
        }
        return TransactionMessages.BALANCE_INSUFFICIENT;
    }
}
