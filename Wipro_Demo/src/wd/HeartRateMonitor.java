package wd;

public class HeartRateMonitor {

	public static void main(String[] args) {
		int heartRate = 120;
		while(heartRate > 100) {
			System.out.println("Heart rate is high: " + heartRate + " bpm - Monitoring...");
			heartRate -= 6;
		}
		System.out.println("Heart rate is normal now: " + heartRate + "bpm");
	}
}
		
		
		// TODO Auto-generated method stub

	