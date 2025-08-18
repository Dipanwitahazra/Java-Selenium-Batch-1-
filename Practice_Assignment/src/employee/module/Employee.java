package employee.module;

	public abstract class Employee {
		String name;
		int id;
		double salary;
		Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		}
		
		public abstract void displayDetails();
		
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		

}





