package wd;

public class BMICalculator {
static String unitSystem = "Metric" ; // static variable
float heightInMeters; // instance variable
float weightInKg; // instance variable
public BMICalculator(float height, float weight) {
	heightInMeters = height;
	weightInKg = weight;
}
void calculateBMI() {
	float bmi; // Local variable
	bmi = weightInKg / (heightInMeters * heightInMeters);
	
	System.out.println("Unit System  :" + unitSystem);
	System.out.println("Height (meters)  :" + heightInMeters);
	System.out.println("Weight (kg) :" + weightInKg);
	System.out.println("Calculated BMI :" + bmi);
	
	String category;
	if (bmi < 18.5) {
		category = "Underweight";
	}
	else if (bmi < 24.9) {
		category = "Normal weight";
	}
	else if (bmi < 29.9) {
		category = "Overweight";
	}
	else
	{
		category = "Obese";
	}
	
	System.out.println("BMI Category :" + category);
}

	
	

	public static void main(String[] args) {
		float height = 1.75f;
		float weight = 70.0f;
		 BMICalculator person = new BMICalculator(height, weight);
		 person.calculateBMI();
		 
		// TODO Auto-generated method stub

	}

}
