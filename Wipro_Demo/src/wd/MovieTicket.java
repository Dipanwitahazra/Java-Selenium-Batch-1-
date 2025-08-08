package wd;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ageGroup = "Adult";
		int ticketPrice = 0;
	    System.out.println("Selected Age Group: " + ageGroup);
	    
	    switch (ageGroup) {
	    case "Kid":
	    	ticketPrice = 100;
	    break;
	    case "Teen":
	    	ticketPrice = 150;
	    	break;
	    case "Adult":
	    	ticketPrice = 200;
	    	break;
	    case "Senior":
	    	ticketPrice = 130;
	    	break;
	    default:
	    	System.out.println("Invalid age group selected");
	    	return;
	    }
	    System.out.println("Ticket Price : Rs" + ticketPrice);
	    
	    	
	    }

	}

