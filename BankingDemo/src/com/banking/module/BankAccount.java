package com.banking.module;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(int accNo, String name, double initialBalance) {
		this.accountNumber = accNo;
		this.accountHolderName = name;
		this.balance = initialBalance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposited Rs" + amount);
				
			}
		public void withdraw(double amount) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawn Rs" + amount);
			}else {
				System.out.println("Insufficient balance!");
			
						
		
		}
	}

		public void displayDetails() {
			System.out.println("Account No: " + accountNumber);
			System.out.println("Holder:" + accountHolderName);
			System.out.println("Balance: Rs" + balance);
			
		}
}
	
