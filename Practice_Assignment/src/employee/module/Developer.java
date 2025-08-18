package employee.module;

public class Developer extends Employee {
	String language;
	Developer(String name, int id, double salary, String language){
		super(name, id, salary);
		this.language = language;
	}
	public void displayDetails() {
		System.out.println(toString());
	}
	public String toString() {
		return " Developer: " + name + ", ID: " + id + ", Salary: " + salary + ", Lang: " +language;
	}
	
	}
	


