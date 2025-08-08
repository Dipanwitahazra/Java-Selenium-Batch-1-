package wd;

public class LibraryMemberRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte memberAge = 20;
		short bookLimit = 3;
		int memberId = 12345;
		long libraryCardNumber = 245136875298L;
		float pendingFine = 85.50f;
		double totalBooksValue = 1754.75;     
        char membershipType = 'P';             
        boolean isActive = true; 
        System.out.println("....Library Member Registration....");
        System.out.println("Member ID             : " + memberId);
        System.out.println("Age                   : " + memberAge);
        System.out.println("Library Card Number   : " + libraryCardNumber);
        System.out.println("Book Limit            : " + bookLimit + " books");
        System.out.println("Pending Fine          : Rs" + pendingFine);
        System.out.println("Total Books Value     : Rs" + totalBooksValue);
        System.out.println("Membership Type       : " + membershipType);
        System.out.println("Is Membership Active? : " + isActive);
    }
}

	