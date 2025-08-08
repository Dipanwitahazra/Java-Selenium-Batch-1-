package wd;

public class ElectricityBill {

	public static void main(String[] args) {
		byte dependents = 3;
		short prevReading = 1250;
		int currReading = 1500;
		long phoneNumber = 2486352147L;
		float pricePerUnit = 5.6f;
		double totalBill = (currReading - prevReading) * pricePerUnit;
		char connectiontype = 'D';
		boolean isPaid = false;
		System.out.println("....Electricity Bill....");
		System.out.println("Customer Phone number: " + phoneNumber);
		System.out.println("Connection Type: " + connectiontype);
		System.out.println("Previous Reading: " + prevReading);
		System.out.println("Current Reading: " + currReading);
		System.out.println("Units Consumed: " + (currReading - prevReading));
		System.out.println("Rate per Unit: " + pricePerUnit);
		System.out.println("Number of Dependents: " +dependents);
		System.out.println("Total Bill Amount: " + totalBill);
		System.out.println("Bill Payment Status: " + (isPaid ? "Paid" : "Unpaid"));
		
		

	}

}
