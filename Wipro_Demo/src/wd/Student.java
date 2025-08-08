package wd;
import java.util.ArrayList;
import java.util.Scanner;
 class St_ex {
	String name;
	ArrayList<Integer> marks = new ArrayList<>();
	St_ex(String name){
		this.name = name;
	}
	void addMark(int mark) {
		marks.add(mark);
		
	}
	
	double calculateAverage() {
		int total = 0;
		for(Integer mark : marks) {
			total += mark;
		}
		if (marks.size() == 0) 
			return 0;
		return(double) total / marks.size();
		
		
		}
	void displayInfo() {
		System.out.println("Student Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Average: " + calculateAverage());
		
		
	}
 }
 public class Student{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter student name: ");;
		String name = sc.nextLine();
		St_ex s = new St_ex("name");
		System.out.print("How many marks to enter? ");
		int count = sc.nextInt();
		 for(int i = 1; i<= count; i++) {
			 System.out.println("Enter mark " + i + ": ");
			 int mark = sc.nextInt();
			 s.addMark(mark);;
		 }
		 s.displayInfo();
		 sc.close();
			 
		 }
		

}
