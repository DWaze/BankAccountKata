package com.company.operations;

import com.company.account.Account;

public interface AccountOp {

    public TransactionMessages makeTransaction(int amount, Account account);

}