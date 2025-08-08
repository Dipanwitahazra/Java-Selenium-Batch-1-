package wd;
import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int students = 3;
		 int subjects = 4;
		 int[][] marks = new int[students][subjects];
		 for(int i = 0; i < students; i++) {
			 System.out.println("Enter marks for student" + (i+1) + ":");
			 for(int j = 0; j < subjects; j++) {
				 System.out.print(" Subject " + (j + 1) + ": ");;
				 marks[i][j] = sc.nextInt();
				 
			 }
		 }
		 System.out.println("\nReport Card");
		 for(int i = 0; i < students; i++) {
			 System.out.println("Student" + (i + 1) + ":");
			 int total = 0;
			 for (int j = 0; j<subjects; j++) {
				 System.out.println("Subject " + (j+ 1) + ": " + marks[i][j]);
				 total += marks[i][j];
			 }
			 double average = (double) total / subjects;
			 System.out.println("Total Marks: " + total);
			 }
		 }
		// TODO Auto-generated method stub

	}


