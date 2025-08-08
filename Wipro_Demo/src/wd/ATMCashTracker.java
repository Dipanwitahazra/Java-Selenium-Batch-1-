package wd;

import java.util.Scanner;

public class ATMCashTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int atms = 3;
		        int days = 5;
		        int[][] withdrawals = new int[atms][days];
		        for (int i = 0; i<atms; i++) {
		        	System.out.println("Entercash withdeawals for ATM " + (i + 1) + ":");
		        	for (int j = 0; j < days; j++) {
		        		System.out.print("Day" + (j + 1) + ": Rs");;
		        		withdrawals[i][j] = sc.nextInt();
		        	}
		        }
		        System.out.println("\n ATM Cash Withdrawal Report");
		        for(int i =  0; i< atms; i++) {
		        	System.out.print("ATM" + (i + 1) + ": ");;
		        	for(int j = 0; j < days; j++) {
		        		System.out.print("Rs" + withdrawals[i][j] + " ");;
		        	}
		        	System.out.println();
		        }
		        sc.close();
		        
		        	
		        
		// TODO Auto-generated method stub

	}

}
