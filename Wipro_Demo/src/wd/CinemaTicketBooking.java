package wd;

public class CinemaTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte seatRow = 5;                      
	        short screenNumber = 2;                
	        int bookingID = 142536;                
	        long mobileNumber = 2451873697L;       
	        float ticketPrice = 230.75f;           
	        char seatType = 'R';                   
	        boolean isPaid = true; 
	        System.out.println(".... Cinema Ticket Booking Details....");
	        System.out.println("Booking ID            : " + bookingID);
	        System.out.println("Mobile Number         : " + mobileNumber);
	        System.out.println("Screen Number         : " + screenNumber);
	        System.out.println("Seat Row              : " + seatRow);
	        System.out.println("Seat Type             : " + seatType);
	        System.out.println("Ticket Price          : Rs" + ticketPrice);
	        System.out.println("Payment Completed?    : " + isPaid);
	    

	}

}
