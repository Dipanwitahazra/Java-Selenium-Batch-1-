package wd;

public class VotingEligibility {

	public static void main(String[] args) {
		byte age = 23;
		char gender = 'F';
		int voterId = 254786;
		long phoneNumber = 5487632549L;
		boolean isCitizen = true;
		float surveyRating = 8.5f;
		double income = 300000.75;
		boolean isEligible = (age >= 18) && isCitizen;
		System.out.println("....Voter Eligibility Report....");
		System.out.println("Voter ID         : "+ voterId);
		System.out.println("Age              : "+ age);
		System.out.println("Gender           : "+ gender);
		System.out.println("Phone Number     : "+ phoneNumber);
		System.out.println("Citizen Status   : "+ isCitizen);
		System.out.println("Survey Rating    : "+ surveyRating);
		System.out.println("Income           : Rs"+ income);
		
		if (isEligible) {
			System.out.println("You are eligible to vote.");
		}
		else 
		{
			System.out.println("You are not eligible to vote.");
		
		
		}
		
		
				
		// TODO Auto-generated method stub

	}

}
