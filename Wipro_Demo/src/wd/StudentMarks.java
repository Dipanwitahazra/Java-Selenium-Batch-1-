package wd;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int students = 3;
		int subjects = 4;
		int[][] marks = new int[students][subjects];
				
		
		for (int i = 0; i<students; i++) {
			System.out.println("Enter marks for Student" + (i + 1) + ":");
			for (int j = 0; j < subjects; j++) {
				System.out.print(" Subject " + (j + 1) + ": " );
				marks[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("\n Marks Table");
		for (int i = 0; i<students; i++) {
			System.out.println("Student " + (i + 1) + "Marks:");
			for(int j = 0; j < subjects; j++) {
				System.out.println("Subject " + (j + 1) + ":" + marks[i][j]);
				
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
