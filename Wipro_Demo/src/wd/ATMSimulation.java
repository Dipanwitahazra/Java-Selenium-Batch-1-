package wd;

public class ATMSimulation {

	public static void main(String[] args) {
		int balance = 1000;
		int withdrawal = 200;
		int transactions = 0;
		while (balance >= withdrawal) {
			balance -= withdrawal;
			transactions++;
			System.out.println("Withdrawn Rs" + withdrawal + ". Balance: Rs" + balance);
		}
			System.out.println("Not enough balance. Total transactions: " + transactions);
			
		}
}

		// TODO Auto-generated method stub

	


