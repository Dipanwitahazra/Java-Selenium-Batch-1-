package com.banking.module;

import java.util.HashMap;

public class AccountOperationsImpl implements AccountOperations {

    private HashMap<Integer, BankAccount> accounts = new HashMap<>();

    
    public void deposit(int accountNumber, double amount) {
        BankAccount acc = accounts.get(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void withdraw(int accountNumber, double amount) {
        BankAccount acc = accounts.get(accountNumber);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void displayAccount(int accountNumber) {
        BankAccount acc = accounts.get(accountNumber);
        if (acc != null) {
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Holder Name: " + acc.getAccountHolderName());
            System.out.println("Balance: Rs" + acc.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (BankAccount acc : accounts.values()) {
                displayAccount(acc.getAccountNumber());
            }
        }
    }
    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account added for: " + account.getAccountHolderName());
    }
}