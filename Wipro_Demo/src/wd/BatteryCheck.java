package wd;

public class BatteryCheck {

	public static void main(String[] args) {
		for(int battery = 100; battery >= 0; battery -= 20) {
			if (battery <= 20)
				System.out.println("Battery at " + battery + "%: Plug in charger");
			else
				System.out.println("Battery at " + battery + "%: OK");
			
		}
		// TODO Auto-generated method stub

	}

}
