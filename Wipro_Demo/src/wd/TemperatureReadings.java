package wd;
import java.util.Scanner;

public class TemperatureReadings {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int totalReadings = 5;
int count = 1;
System.out.println(" Enter " + totalReadings + " temperature readings:");

do {
    System.out.print("Reading " + count + ": ");
    double temperature = sc.nextDouble();
    System.out.println(" Temperature recorded: " + temperature + "°C\n");
    count++;
} while (count <= totalReadings);

sc.close();
}


		// TODO Auto-generated method stub

	

}
