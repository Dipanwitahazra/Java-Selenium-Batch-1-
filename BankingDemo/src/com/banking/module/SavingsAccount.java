package com.banking.module;


	public class SavingsAccount extends BankService {
	    public SavingsAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	   
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Savings Account: Deposited Rs" + amount);
	    }
	

	    
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Savings Account: Withdrawn Rs" + amount);
	        } else {
	            System.out.println("Savings Account: Insufficient balance!");
	        }
	    }
	    }
	    
	

	