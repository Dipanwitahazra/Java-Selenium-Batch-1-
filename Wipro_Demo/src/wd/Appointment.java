package wd;

public class Appointment {
	static String hospitalName = "City Hospital"; // static variable
	String patientName; // instance variable
	String doctorName; // instance variable
	 void bookAppointment() {
		 int tokenNumber = (int)(Math.random() * 100); // Local variable
		 	System.out.println("Hospital: " + hospitalName);
		 	System.out.println("Patient: " + patientName);
		 	System.out.println("Doctor: " + doctorName);
		 	System.out.println("Token:" + tokenNumber);
		 	
	 }
	 
	

	public static void main(String[] args) {
		Appointment a = new Appointment();
		a.patientName = "Sneha Lahiri";
		a.doctorName = "Dr.Paul";
		a.bookAppointment();
		
		
		
		// TODO Auto-generated method stub

	}

}
