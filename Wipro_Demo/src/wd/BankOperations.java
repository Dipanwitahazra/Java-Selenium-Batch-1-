package wd;
import java.util.Scanner;

public class BankOperations {
	static int balance = 1000;
	public static int deposit(int amount) {
		balance += amount;
		return balance;
		
	}
	public static void withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: Rs" + amount);
		}
		else
		{
			System.out.println("Insufficient Balance.");
		}
	}
		public static void showBalance() {
			System.out.println("Current balance: Rs" + balance);
		}
		public static void simpleDeposit(int amount) {
			balance += amount;
			System.out.println("Amount Deposited: Rs" + amount);
			
			
				
			}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		showBalance();
		System.out.print("Enter amount to deposit:");
		int amount1 = sc.nextInt();
		int updatedBalance = deposit(amount1);
		System.out.println("Balance after deposit: Rs" + updatedBalance);
		System.out.print("Enter amount to withdraw: ");;
		int amount2 = sc.nextInt();
		withdraw(amount2);
		showBalance();
		System.out.print("Enter another deposit amount: ");;
		int amount3 = sc.nextInt();
		simpleDeposit(amount3);
		showBalance();
		
		
				
		// TODO Auto-generated method stub

	}

}
