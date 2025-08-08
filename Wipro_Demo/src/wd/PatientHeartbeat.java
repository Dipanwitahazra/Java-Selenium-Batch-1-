package wd;
import java.util.Scanner;
public class PatientHeartbeat {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of readings: ");
    int n = sc.nextInt();
    int[] heartbeats = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Enter heartbeat " + (i + 1) + ": ");
        heartbeats[i] = sc.nextInt();
    }

    System.out.println("\nAnalyzing heartbeat readings:");

    for (int bpm : heartbeats) {
        if (bpm >= 60 && bpm <= 100)
            System.out.println("Normal: " + bpm + " bpm");
        else
            System.out.println("Abnormal: " + bpm + " bpm");
    }

    sc.close();
}
}
