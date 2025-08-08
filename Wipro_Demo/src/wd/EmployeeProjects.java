package wd;
import java.util.Scanner;
public class EmployeeProjects {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of employees: ");
	        int employees = sc.nextInt();
	        sc.nextLine(); 

	        String[][] projects = new String[employees][]; 

	        for (int i = 0; i < employees; i++) {
	            System.out.print("Enter number of projects for employee " + (i + 1) + ": ");
	            int numProjects = sc.nextInt();
	            sc.nextLine(); 
	            projects[i] = new String[numProjects];

	            for (int j = 0; j < numProjects; j++) {
	                System.out.print("Enter name of project " + (j + 1) + ": ");
	                projects[i][j] = sc.nextLine();
	            }
	        }

	        // Displaying the employee projects
	        System.out.println("\nEmployee Project Details:");
	        for (int i = 0; i < employees; i++) {
	            System.out.print("Employee " + (i + 1) + " Projects: ");
	            for (String project : projects[i]) {
	                System.out.print(project + " ");
	            }
	            System.out.println();
	        }
	    }
	}
		// TODO Auto-generated method stub


