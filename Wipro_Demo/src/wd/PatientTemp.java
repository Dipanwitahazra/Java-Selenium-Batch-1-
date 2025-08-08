package wd;

public class PatientTemp {
	

	public static void main(String[] args) {
		
		        double temperature = 38.5; 
		        int checkCount = 0;

		        System.out.println("ICU Temperature Monitoring System");

		        do {
		            System.out.println("Check " + (++checkCount) + ": Patient temperature = " + temperature + "°C");
		            temperature -= 0.5;
		            System.out.println("Status: Patient still has a fever. Monitoring continues...\n");

		        } while (temperature > 37.5 || temperature < 36.0);

		        System.out.println("Check " + (++checkCount) + ": Patient temperature = " + temperature + "°C");
		        System.out.println("Status: Temperature is now normal. Monitoring stopped.");
		    }


		// TODO Auto-generated method stub

	}


