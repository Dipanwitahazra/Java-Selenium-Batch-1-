package wd;

public class EmployeeInfo {
	static String companyName = "Innovative Pvt Ltd"; // static variable
	String employeeName = "Riya"; // instance variable
	public void display() {
	int employeeId = 1201; // Local variable
	System.out.println("Company Name (static): " + companyName);
	System.out.println("Employee Name (instance): " + employeeName);
    System.out.println("Employee ID (local): " + employeeId);
}

		
public static void main(String[] args) {
	new EmployeeInfo().display();
    	 
		// TODO Auto-generated method stub

	}

}
