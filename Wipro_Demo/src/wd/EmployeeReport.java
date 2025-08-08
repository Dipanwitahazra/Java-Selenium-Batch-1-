package wd;

public class EmployeeReport {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Profile Report\n");
        sb.append("Name  : Riya Sharma\n");
		sb.append("ID    : EMP4051\n");
		sb.append("Department: Marketing\n");
		sb.append("Position  : Analyst\n");
		sb.append("Salary    : Rs 50,000\n");
		sb.insert(0,  "NexGenix\n\n");
		int positionIndex = sb.indexOf("Analyst");
			if(positionIndex != -1) {
				sb.replace(positionIndex, positionIndex +7,"Senior Analyst");
				
			}
		System.out.println(sb.toString());
		// TODO Auto-generated method stub

	}

}
