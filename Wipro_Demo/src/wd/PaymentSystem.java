package wd;
abstract class Payment{
	abstract void makePayment(double amount);
	
}
class CreditCardPayment extends Payment{
	void makePayment(double amount) {
		System.out.println("Payment of Rs" + amount + " made using Credit Card.");
	}
	
	}
class UpiPayment extends Payment{
	void makePayment(double amount) {
		System.out.println("Payment of Rs" + amount + " made using UPI.");
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		Payment payment1 = new CreditCardPayment();
		payment1.makePayment(1000);
		Payment Payment2 = new UpiPayment();
		Payment2.makePayment(500);
		
		
		// TODO Auto-generated method stub

	}

}
