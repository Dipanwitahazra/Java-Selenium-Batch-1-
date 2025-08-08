package wd;

public class ParkingLot {

	public static void main(String[] args) {
		int totalSpaces = 4;
		int occupied = 0;
		while (occupied < totalSpaces) {
		// TODO Auto-generated method stub
			occupied++;
			System.out.println("Car parked. Spaces left: " + (totalSpaces - occupied));
		}
		System.out.println("Parking Lot Full");

	}

}
