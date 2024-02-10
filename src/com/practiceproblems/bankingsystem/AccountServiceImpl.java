package com.practiceproblems.bankingsystem;

public class AccountServiceImpl implements AccountService{

    @Override
    public void deposit(Account account, double amount) {
        if(amount>0){
            account.setBalance(amount + account.getBalance());
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public boolean withdraw(Account account, double amount) {
        if(amount>0 && account.getBalance()>=amount){
            account.setBalance(account.getBalance()-amount);
            System.out.println(amount + " was withdrawn successfully");
            return true;
        }else{
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }
}
