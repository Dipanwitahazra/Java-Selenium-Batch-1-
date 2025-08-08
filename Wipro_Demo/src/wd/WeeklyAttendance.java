package wd;
import java.util.Scanner;
public class WeeklyAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int students = 5;
		 int days = 7;
		 char[][] attendance = new char[students][days];
		 for(int i = 0; i< students; i++) {
			 System.out.println("Enter attendance for Student " + (i + 1) + " (P for Present, A for Absent): ");
			 for (int j = 0; j < days; j++) {
				 System.out.println("Day" + (j + 1) + ": ");
				 attendance[i][j] = sc.next().toUpperCase().charAt(0);
			 }
		 }
		 System.out.println("\n Weekly Attendance Report");
		 for (int i = 0; i < students; i++) {
			 System.out.print("Student " + (i + 1) + ": ");
			 for (int j = 0; j < days; j++) {
				 System.out.print(attendance[i][j] + " ");
			 }
			 System.out.println();
		 }
		 sc.close();
			 }
		 
		// TODO Auto-generated method stub

	}


