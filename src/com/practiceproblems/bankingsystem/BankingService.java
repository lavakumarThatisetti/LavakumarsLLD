package com.practiceproblems.bankingsystem;

public class BankingService {
    private TransactionService transactionService;
    private AccountService accountService;

    public BankingService(TransactionService transactionService, AccountService accountService) {
        this.transactionService = transactionService;
        this.accountService = accountService;
    }

    public void transfer(Customer from, Customer to, double amount){
        if(accountService.withdraw(from.getAccount(), amount)){
            accountService.deposit(to.getAccount(), amount);
            transactionService.addTransaction(from.getAccount().getAccountNumber(), to.getAccount().getAccountNumber(), amount);

        } else {
            System.out.println("In sufficent Balance in "+from.getName());
        }
    }
}
