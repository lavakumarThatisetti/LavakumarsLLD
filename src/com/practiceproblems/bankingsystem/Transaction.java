package com.practiceproblems.bankingsystem;

import java.util.Date;

public class Transaction {
    private String fromAccount;
    private String toAccount;
    private double amount;
    private Date timestamp;

    public Transaction(String fromAccount, String toAccount, double amount, Date timestamp) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
