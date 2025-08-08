package wd;

public class SalarySlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empId = 101;
		String empName = "Dipanwita Hazra";
		char gender = 'F';
		float basicSalary = 25000.0f;
        float hra = basicSalary * 0.20f; 
        float da = basicSalary * 0.10f;  
        float pf = basicSalary * 0.05f;  
        float tax = basicSalary * 0.08f; 

        
        float grossSalary = basicSalary + hra + da;
        float netSalary = grossSalary - pf - tax;

        
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Gender        : " + gender);
       
        System.out.println("Basic Salary  : Rs" + basicSalary);
        System.out.println("HRA (20%)     : Rs" + hra);
        System.out.println("DA (10%)      : Rs" + da);
        System.out.println("PF (5%)       : Rs" + pf);
        System.out.println("Tax (8%)      : Rs" + tax);
       
        System.out.println("Gross Salary  : Rs" + grossSalary);
        System.out.println("Net Salary    : Rs" + netSalary);

	}

}
