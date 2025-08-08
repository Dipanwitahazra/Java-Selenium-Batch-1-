package wd;
import java.util.Arrays;
import java.util.Scanner;

class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class Employee_Ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Emp[] employees = new Emp[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            employees[i] = new Emp(name, salary);
        }

      
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

      
        System.out.println("\nSorted Employees by Salary (Ascending):");
        for (Emp emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}