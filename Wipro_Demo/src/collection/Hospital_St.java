package collection;
import java.util.*;
class Patient{
	private String id;
	private String name;
	private int age;
	private String disease;
	
	public Patient(String id, String name, int age, String disease) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.disease = disease;
}
	  public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getDisease() {
	        return disease;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setDisease(String disease) {
	        this.disease = disease;
	    }

	    
	    
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
	    }
	}

	public class Hospital_St {
	    public static void main(String[] args) {
	        HashMap<String, Patient> patientMap = new HashMap<>();

	        
	        patientMap.put("T01", new Patient("T01", "Shreya", 30, "Cold"));
	        patientMap.put("T02", new Patient("T02", "Shalini", 50, "Flu"));
	        patientMap.put("T03", new Patient("T03", "Riya", 25, "Headache"));

	        
	        if (patientMap.containsKey("T02")) {
	            Patient p = patientMap.get("T02");
	            p.setDisease("Fever");
	            System.out.println("Updated T02's disease to Fever.");
	        }

	      
	        System.out.println("\nDetails of T01:");
	        System.out.println(patientMap.get("T01"));

	        
	        System.out.println("\nAll Patients:");
	        for (Patient p : patientMap.values()) {
	            System.out.println(p);
	        }

	       
	        patientMap.remove("T03");
	        System.out.println("\nAfter removing T03:");
	        for (Patient p : patientMap.values()) {
	            System.out.println(p);
	        }

	       
	        System.out.println("\nContains T01? " + patientMap.containsKey("T01"));

	        
	        System.out.println("Total Patients: " + patientMap.size());

	       patientMap.clear();
	        System.out.println("\nSystem cleared. Is empty? " + patientMap.isEmpty());
	    }
	}

