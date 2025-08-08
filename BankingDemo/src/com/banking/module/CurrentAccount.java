package com.banking.module;


	public class CurrentAccount extends BankService {
	    public CurrentAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	   
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Current Account: Deposited Rs" + amount);
	    }

	  
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Current Account: Withdrawn Rs" + amount);
	        } else {
	            System.out.println("Current Account: Insufficient balance!");
	        }
	    }
	}
