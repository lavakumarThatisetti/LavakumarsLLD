package com.practiceproblems.bankingsystem;

public class Main {
    public static void main(String[] args) {
        TransactionService transactionService = new TransactionServiceImpl(new TransactionManagerImpl());
        AccountService accountService = new AccountServiceImpl();
        Account account1 = new Account("123", 1000);
        Account account2 = new Account("124", 0);

        Customer customer1 = new Customer("Lava", account1);
        Customer customer2 = new Customer("kumar", account2);

        BankingService bankingService = new BankingService(transactionService, accountService);

        bankingService.transfer(customer1, customer2, 500);

        System.out.println(customer1.getAccount().getBalance());
        System.out.println(customer2.getAccount().getBalance());

        System.out.println(transactionService.getTransaction());

        // Select * from Account -> account_name, balance
    }
}
