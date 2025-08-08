package wd;

public class PatientTemperature {

	public static void main(String[] args) {
		double[] temperatures = {98.6, 99.2, 100.2 ,101.2, 98.9};
		for (int i = 0; i < 5; i++) {
			System.out.println("Hour" + (i + 1) + ": Temperature = " + temperatures[i]);
			if (temperatures[i] > 100.2) {
				System.out.println("High temperature!");
			}
			else
			{
				System.out.println("Normal temperature!");
			}
			System.out.println();
			}
			
		
		// TODO Auto-generated method stub

	}

}

