package wd;

public class PinEntry {

	public static void main(String[] args) {
		int attempts = 0;
		String correctPin = "1234";
		String enteredPin = "2351";
		do {
			System.out.println("Enter your PIN...");
			attempts++;
			if(attempts == 2) enteredPin = "1234";
		}
		while(!enteredPin.equals(correctPin) && attempts < 3);
		if (enteredPin.equals(correctPin))
			System.out.println("Access granted.");
		else
			System.out.println("Access denied.");
		}
		// TODO Auto-generated method stub

	}


