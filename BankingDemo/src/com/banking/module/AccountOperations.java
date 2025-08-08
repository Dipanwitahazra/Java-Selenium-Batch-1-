package com.banking.module;


public interface AccountOperations {
	
	    void deposit(int accountNumber, double amount);
	    void withdraw(int accountNumber, double amount);
	    void displayAccount(int accountNumber);
	    
	   
	}