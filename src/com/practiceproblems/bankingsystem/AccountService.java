package com.practiceproblems.bankingsystem;

public interface AccountService {
    void deposit(Account account, double amount);
    boolean withdraw(Account account, double amount);
}
