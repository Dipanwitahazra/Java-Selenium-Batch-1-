package wd;

public class HealthRecordTracker {

	public static void main(String[] args) {
		short patientId = 1034;
		byte age = 47;
		float bodyTemperature = 98.6f;
		double oxygenLevel = 96.3;
		boolean isCritical = false;
		char bloodGroup = 'O';
		long emergencyContact = 8654729513L;
		int wardNumber = 325;
		System.out.println("....Patient Health Record....");
		System.out.println("Patient ID         : " + patientId);
		System.out.println("Age                : " + age);
		System.out.println("Body Temperature   : " + bodyTemperature + "°F");
		System.out.println("Oxygen Level       : " + oxygenLevel + "%");
		System.out.println("Critical Condition : " + isCritical);
		System.out.println("Blood Group        : " + bloodGroup);
		System.out.println("Emergency Contact  : " + emergencyContact);
		System.out.println("Ward Number        : " + wardNumber);
		
		if (oxygenLevel < 90 || isCritical) {
			System.out.println("Immediate medical attention required.");
		}
		else
		{
			System.out.println("Patient is stable.");
		}
		
		
		// TODO Auto-generated method stub

	}

}
