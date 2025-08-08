package wd;

public class PinCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 0;
        String correctPin = "2513";
        String enteredPin = "0000"; 
        while (!enteredPin.equals(correctPin) && attempts < 3) {
            System.out.println("Incorrect PIN. Try again.");
            attempts++;
           
            if (attempts == 2) enteredPin = "2513";
        }

        if (enteredPin.equals(correctPin))
            System.out.println("Access granted.");
        else
            System.out.println("Access denied. Too many attempts.");
    


	}

}
