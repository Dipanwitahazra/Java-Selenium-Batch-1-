package wd;
import java.util.Scanner;
interface Operation{
	double calculate(double a, double b);
	
}

public class LambdaCalculator {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		Operation add = (a,b)-> a + b;
		Operation subtract = (a,b) -> a-b;
		Operation multiply = (a,b) -> a * b;
		Operation divide = (a,b) ->{
			if (b==0) {
				System.out.println("Cannot divide by zero");
				return 0;
				
			}
			return a / b;
		};
		System.out.print("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Enter operator(+, -, *, /):");
		String op = sc.next();
		double result = 0;
		 switch(op) {
		 case "+":
			 result = add.calculate(num1, num2);
			 break;
		 case "-":
			 result = subtract.calculate(num1,  num2);
			 break;
		 case "*":
			 result = multiply.calculate(num1,  num2);
			 break;
		 case "/":
			 result = divide.calculate(num1,  num2);
		 break;
		 default:
			 System.out.println("Invalid operation.");
			 sc.close();
			 return;
		 }
		 System.out.println("Result: " + result);
		 sc.close();
	}
}
			 
			 
		 
		
		
		
		// TODO Auto-generated method stub

	