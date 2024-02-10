package com.practiceproblems.bankingsystem;

import java.util.List;

public interface TransactionManager {

    void add(Transaction transaction);
    List<Transaction> getTransaction();
}
