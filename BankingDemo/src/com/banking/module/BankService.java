package com.banking.module;


	public abstract class BankService {
	    protected int accountNumber;
	    protected double balance;

	    public BankService(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    
	    public abstract void deposit(double amount);

	    public abstract void withdraw(double amount);

	    public void showBalance() {
	        System.out.println("Account No: " + accountNumber + ", Balance: Rs" + balance);
	    }
	}


