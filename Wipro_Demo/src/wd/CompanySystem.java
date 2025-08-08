package wd;
import java.util.Scanner;
class Employee{
	String name;
	int id;
	
	void work() {
		System.out.println("Employee is working.");
		
	}
	void displayInfo() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
	
}
class Manager extends Employee{
	void manageTeam() {
		System.out.println("Manager is managing the team.");
	}
	}
	

public class CompanySystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				Manager manager = new Manager();

        System.out.print("Enter Manager ID: ");
        manager.id = sc.nextInt();         
        sc.nextLine();                     

        System.out.print("Enter Manager Name: ");
        manager.name = sc.nextLine();     

        
        System.out.println("\n... Manager Details ...");
        manager.displayInfo();                  
        manager.work();                         
        manager.manageTeam();                  

        sc.close();
    }
}
		// TODO Auto-generated method stub

	

