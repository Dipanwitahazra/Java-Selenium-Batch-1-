package wd;

import java.util.Scanner;

abstract class Vehicle{
	abstract void startEngine();
	
}
class Car extends Vehicle{
void startEngine() {
	System.out.println("Car engine started.");
}
}
public class VehicleSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("Do you want to start the car engine? (yes/no): ");;
				String input = sc.nextLine();
				if(input.equalsIgnoreCase("yes")) {
					Vehicle myCar = new Car();
					myCar.startEngine();
				}
				else
				{
					System.out.println("Engine not started.");
					
				}
				sc.close();
		// TODO Auto-generated method stub

	}

}
