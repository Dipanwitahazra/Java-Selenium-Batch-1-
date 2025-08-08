package wd;

import java.util.Scanner;

public class StudentNames {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
				 int totalStudents = 3;
		 int count = 1;
		 System.out.println("Enter names of " + totalStudents + " students:");
		 while(count <= totalStudents) {
			 System.out.print("Enter name of Student" + count + ": ");;
			 String name  = sc.nextLine();
			 System.out.println("Student" + count + "; " + name + " has been recorded.\n");
			 count++;
		 }
		 sc.close();
		 
		// TODO Auto-generated method stub

	}

}
