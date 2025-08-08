package wd;

public class Weather {
static String city = "Kolkata"; // static variable
double temperature; //instance variable
public static void showWeather() {
	int currentTemp = 37;// Local variable
	System.out.println("City:" + city +", Temperature:"+ currentTemp + "°C");
}

	public static void main(String[] args) {
		showWeather();
		// TODO Auto-generated method stub

	}

}
