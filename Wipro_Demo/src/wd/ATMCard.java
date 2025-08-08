package wd;
import java.util.HashMap;
import java.util.Scanner;
class InvalidPinException extends Exception
{
	public 	InvalidPinException(String message)
	{
		super(message);
		
	}
}
class InsufficientBalanceException extends Exception{
	public 	InsufficientBalanceException(String message) {
		super(message);
	}
}
		class BankAccount{
			private int accountNumber;
			private int pin;
			private double balance;
			
		
		public BankAccount(int accountNumber, int pin, double balance) {
			this.accountNumber = accountNumber;
			this.pin = pin;
			this.balance = balance;
		}
		public boolean validatePin(int inputPin) throws InvalidPinException{
			if (this.pin!= inputPin) {
				throw new  InvalidPinException("Wrong PIN");
				
			}
			return true;
		}
		public double getBalance() {
			return balance;
			
		}
		 public void deposit(double amount) {
			 if (amount > 0) {
				 balance += amount;
				 System.out.println("Rs" + amount + " deposited.");
			 }
		 }
		 public void withdraw(double amount) throws InsufficientBalanceException{
			 if(amount > balance) {
				 throw new  InsufficientBalanceException("Not enough balance.");
			 }
			 balance -= amount;
			 System.out.println("Rs" + amount + " withdrawn.");
		 }
	}
				 
public class ATMCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, BankAccount> accounts = new HashMap<>();
		accounts.put(2001,  new BankAccount(2001, 1112, 4000.0));
		accounts.put(2002,  new BankAccount(2002, 1113, 10000.0));
		System.out.print("Insert card (Enter account number): ");
		int accNum = sc.nextInt();
		BankAccount acc = accounts.get(accNum);
		
		int attempts = 0;
		boolean accessGranted = false;
		
		   while (attempts < 3 && !accessGranted) {
	            try {
	                System.out.print("Enter your 4-digit PIN: ");
	                int pin = sc.nextInt();

	                acc.validatePin(pin); 
	                accessGranted = true;
	                
	                int choice = 0;
	                while(choice !=4) {
	                System.out.println("\n--- Welcome to ATM ---");
	                System.out.println("1. Check Balance");
	                System.out.println("2. Deposit");
	                System.out.println("3. Withdraw");
	                System.out.println("4. Exit");
	                System.out.print("Enter your choice: ");
	                 choice = sc.nextInt();

	                if (choice == 1) {
	                    System.out.println("Your balance is: Rs" + acc.getBalance());
	                } else if (choice == 2) {
	                    System.out.print("Enter amount : Rs");
	                    double amount = sc.nextDouble();
	                    acc.deposit(amount);
	                }else if (choice == 3) {
	                	System.out.print("Enter amount : Rs");
	                	double amount = sc.nextDouble();
	                	acc.withdraw(amount);
	                	
	                }
	                else if (choice == 4) {
	                	System.out.println("Thank you.");
	                	
	                }
	                else {
	                	System.out.println("Invalid choice.");
	                }

	                }
	            }
	                catch (InvalidPinException e) {
	                	System.out.println("Error: " + e.getMessage());
	                
	                attempts++;
	               
	                if (attempts == 3) {
	                    System.out.println("Card blocked after 3 failed attempts.");
	                }
	                }
	                catch(InsufficientBalanceException e) {
	                	System.out.println("Error: " + e.getMessage());
	                			
	                
	            } finally {
	                System.out.println("Transaction logged.\n");
	            }
	        }

	        System.out.println("Please remove your card.");
	        sc.close();
	    }
	}