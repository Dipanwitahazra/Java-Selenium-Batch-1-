package wd;

public class Banking {

	public static void main(String[] args) {
		int choice = 2;
		double balance = 3000.00;
		double amount = 1000.00;
		System.out.println("Welcome to Yes Bank");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.You selected option: " + choice);
	    
		switch(choice) {
		case 1:
			balance += amount;
			System.out.println("Deposited: Rs" + amount);
			System.out.println("Updated Balance: Rs" + balance);
            break;

        case 2:
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: Rs" + amount);
                System.out.println("Updated Balance: Rs" + balance);
            } else {
            	System.out.println("Insufficient Balance!");

            }
            break;

        case 3:
            System.out.println("Current Balance: Rs" + balance);
            break;

        default:
            System.out.println("Invalid Option");
    }


            
		
				
		// TODO Auto-generated method stub

	}

}
