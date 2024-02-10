package com.practiceproblems.bankingsystem;

import java.util.List;

public class TransactionManagerImpl implements TransactionManager {
    List<Transaction> transactions;
    @Override
    public void add(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public List<Transaction> getTransaction() {
        return transactions;
    }
}
