package com.banking.module;


import java.util.Scanner;

public class BankingModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountOperationsImpl service = new AccountOperationsImpl();

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();  
            System.out.print("Account Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount acc = new BankAccount(accNo, name, balance);
            service.addAccount(acc);
        }

      
        int choice;
        do {
            System.out.println("\n... Banking Service ...");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account No: ");
                int dAcc = sc.nextInt();
                System.out.print("Enter Amount to Deposit: ");
                double dAmt = sc.nextDouble();
                service.deposit(dAcc, dAmt);
            } else if (choice == 2) {
                System.out.print("Enter Account No: ");
                int wAcc = sc.nextInt();
                System.out.print("Enter Amount to Withdraw: ");
                double wAmt = sc.nextDouble();
                service.withdraw(wAcc, wAmt);
            } else if (choice == 3) {
                System.out.print("Enter Account No: ");
                int aNo = sc.nextInt();
                service.displayAccount(aNo);
            } else if (choice == 4) {
                service.displayAllAccounts();
            } else if (choice == 5) {
                System.out.println("Thank you for using Laksya Bank!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}