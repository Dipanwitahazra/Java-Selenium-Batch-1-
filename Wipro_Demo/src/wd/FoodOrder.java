package wd;

import java.util.Scanner;

public class FoodOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				String choice;
		int orderNumber = 1;
		do{
			System.out.println("Order placed for item #" + orderNumber);
			orderNumber++;
			System.out.print("Do you want to order more? (yes/no): ");
			choice = sc.nextLine().toLowerCase();
		}
		while (choice.equals("yes"));
		System.out.println("Thank you! Preparing your food orders...");
		sc.close();
		}
}