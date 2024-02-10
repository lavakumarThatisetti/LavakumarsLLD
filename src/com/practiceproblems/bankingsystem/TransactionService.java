package com.practiceproblems.bankingsystem;

import java.util.List;

public interface TransactionService {
    void addTransaction(String fromAccount, String toAccount, double amount);

    List<Transaction> getTransaction();
}
