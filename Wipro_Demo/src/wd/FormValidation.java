package wd;
import java.util.Scanner;
public class FormValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		String ageStr = sc.nextLine();
		Integer age = Integer.valueOf(ageStr);
		System.out.print("Enter your salary: ");
		String salaryStr = sc.nextLine();
		Double salary = Double.valueOf(salaryStr);
		System.out.print("Do you want to subscribe? (true/false): ");
		String subStr = sc.nextLine();
		Boolean subscribed = Boolean.valueOf(subStr);
		int agePrimitive = age;
		double salaryPrimitive = salary;
		boolean subPrimitive = subscribed;
		
		System.out.println("\n... Form Details...");
			
		// TODO Auto-generated method stub

	}

}
