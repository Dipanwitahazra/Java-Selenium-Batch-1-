package wd;
import java.util.Scanner;
public class PatientRecordSystem {

	
		static class Patient {
	        private String name;
	        private int age;
	        private String disease; 

	       
	        public void setDetails(String name, int age, String disease) {
	            this.name = name;
	            this.age = age;
	            this.disease = disease;
	        }

	        
	        public String getName() {
	            return name;
	        }

	        public int getAge() {
	            return age;
	        }

	        
	        public void showDiseaseInfo() {
	            System.out.println("Disease: " + disease);
	        }
	    }

	  
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Patient p = new Patient();

	      
	        System.out.print("Enter patient name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter patient age: ");
	        int age = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter disease: ");
	        String disease = sc.nextLine();

	        
	        p.setDetails(name, age, disease);

	     
	        System.out.println("\n... Patient Record...");
	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());
	        p.showDiseaseInfo();
	    }
	}
		// TODO Auto-generated method stub

	