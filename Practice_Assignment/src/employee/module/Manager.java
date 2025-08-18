package employee.module;
public class Manager extends Employee {
	 String department;

	     Manager(String name, int id, double salary, String department) {
	        super(name, id, salary);
	        this.department = department;
	    }
	     public void displayDetails() {
	    	 System.out.println(toString());
	     }

	    
	    public String toString() {
	        return "Manager: " + name + ", ID: " + id + ", Salary: " + salary + ", Dept: " + department;
	        
	    }
	}



