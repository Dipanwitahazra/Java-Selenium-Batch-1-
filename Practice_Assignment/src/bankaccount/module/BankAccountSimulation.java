package bankaccount.module;
import java.util.Scanner;

	class InsufficientFundsException extends Exception {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}

	class BankAccount {
	    private double balance; 

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	 
	    public double getBalance() {
	        return balance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    
	    public void withdraw(double amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds! Available: " + balance);
	        } else if (amount > 0) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    
	    public void transfer(BankAccount target, double amount) throws InsufficientFundsException {
	        this.withdraw(amount);
	        target.deposit(amount);
	        System.out.println("Transferred: " + amount + " to target account.");
	    }
	}

	public class BankAccountSimulation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        BankAccount acc1 = new BankAccount(5000);
	        BankAccount acc2 = new BankAccount(3000);

	        try {
	            System.out.println("Initial Balance of acc1: " + acc1.getBalance());
	            System.out.println("Initial Balance of acc2: " + acc2.getBalance());

	            acc1.deposit(2000);
	            acc1.withdraw(1000);
	            acc1.transfer(acc2, 1500);

	            System.out.println("Final Balance of acc1: " + acc1.getBalance());
	            System.out.println("Final Balance of acc2: " + acc2.getBalance());
	        } catch (InsufficientFundsException e) {
	            System.out.println("Transaction failed: " + e.getMessage());
	        }

	        sc.close();
	    }
	}


	