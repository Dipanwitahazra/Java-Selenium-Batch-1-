package wd;

public class StudentDetails {
	static String schoolName = "DAV Public School"; // static variable
	String name; // instance variable
	void printDetails() {
		int year = 2025; // Local variable
		System.out.println("Student Name: " + name);
        System.out.println("School: " + schoolName);
        System.out.println("Academic Year: " + year);
    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.name = "Riya";
        s1.printDetails();
    
	
		// TODO Auto-generated method stub

	}

}
