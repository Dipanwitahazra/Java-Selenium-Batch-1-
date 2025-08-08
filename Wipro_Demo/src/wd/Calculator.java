package wd;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 15.0;
		double num2 = 5.0;
		char operator = '-';
		double result;
		switch (operator) {
        case '+':
            result = num1 + num2;
            System.out.println("Result = " + result);
            break;
            
        case '-':
        	result = num1 - num2;
        	System.out.println("Result = " + result);
            break;
            
        case '*':
        	result = num1 * num2;
            System.out.println("Result = " + result);
            break;
            
        case '/':
        	 if (num2 != 0) {
                 result = num1 / num2;
                 System.out.println("Result = " + result);
             } else {
                 System.out.println("Error: Division by zero");
             }
             break;
             
        case '%':
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
            break;

        default:
        	System.out.println("Invalid Operator");
        	
    }
}

	}


