package com.practiceproblems.bankingsystem;

import java.util.Date;
import java.util.List;

public class TransactionServiceImpl implements TransactionService {

    TransactionManager transactionManager;

    public TransactionServiceImpl(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public void addTransaction(String fromAccount, String toAccount, double amount) {

        transactionManager.add(new Transaction(fromAccount, toAccount, amount, new Date()));
    }

    @Override
    public List<Transaction> getTransaction() {
        return transactionManager.getTransaction();
    }
}
