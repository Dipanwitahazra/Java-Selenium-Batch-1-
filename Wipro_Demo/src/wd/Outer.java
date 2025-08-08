package wd;

public class Outer {
	static class Exam{
		static void greet(String name) {
			System.out.println("Hello, " + name );
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer.Exam.greet("Dipanwita");

	}

}
