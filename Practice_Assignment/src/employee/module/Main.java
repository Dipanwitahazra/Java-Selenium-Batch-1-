package employee.module;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        List<Employee> employees = new ArrayList<>();

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Type (Manager/Developer): ");
	            String type = sc.nextLine();
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("ID: ");
	            int id = sc.nextInt();
	            System.out.print("Salary: ");
	            double salary = sc.nextDouble();
	            sc.nextLine();

	            if (type.equalsIgnoreCase("Manager")) {
	                System.out.print("Department: ");
	                String dept = sc.nextLine();
	                employees.add(new Manager(name, id, salary, dept));
	            } else {
	                System.out.print("Language: ");
	                String lang = sc.nextLine();
	                employees.add(new Developer(name, id, salary, lang));
	            }
	        }

	       
	        System.out.println("\nAll Employees:");
	        employees.forEach(System.out::println);

	    
	        employees.sort(Comparator.comparingDouble(Employee::getSalary));
	        System.out.println("\nSorted by Salary:");
	        employees.forEach(System.out::println);

	     
	        employees.sort(Comparator.comparing(Employee::getName));
	        System.out.println("\nSorted by Name:");
	        employees.forEach(System.out::println);

	        
	        sc.close();
	    }
	}






	