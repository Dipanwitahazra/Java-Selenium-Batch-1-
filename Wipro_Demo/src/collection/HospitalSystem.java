package collection;
import java.util.*;
class Doctor{
	private String licenseNumber;
	private String name;
	private String department;
	public Doctor(String licenseNumber, String name, String department) {
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.department = department;
		
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Doctor)) return false;
		Doctor other = (Doctor) obj;
		return licenseNumber.equals(other.licenseNumber);
	}
	public int hashCode() {
        return Objects.hash(licenseNumber);
    }

    
    public String toString() {
        return "License: " + licenseNumber + ", Name: " + name + ", Department: " + department;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Doctor> doctors = new HashSet<>();

        while (true) {
        	System.out.println("\n...Doctor Registration...");
        
            System.out.println("\n1. Add Doctor");
            System.out.println("2. Show All Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch(choice) {

            case 1: 
                System.out.print("Enter License Number: ");
                String license = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                Doctor newDoctor = new Doctor(license, name, department);

               
                  if  (doctors.add(newDoctor)) {
                    System.out.println("Doctor registered successfully.");
                  } else {
                    	System.out.println("Doctor already registered");
                }
                    break;
                    
                    case 2:
                    	if (doctors.isEmpty()) {
                  System.out.println("No doctors registered yet.");
            }
            else
            {
            	System.out.println("List of Registered Doctors:");
            	for (Doctor doc : doctors) {
            		System.out.println(doc);
            	}
            	}
            break;
            case 3:
            	
                System.out.println(" Exiting...");
                sc.close();
                return;
                
              default:
            	  System.out.println("Invalid choice. Try again.");
            }
        }
    }
    }