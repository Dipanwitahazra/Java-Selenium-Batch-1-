package wd;

public class Demo {
	static int staticVar = 100;
	int instanceVar = 50;
	public void display() {
		int localVar = 25;
		 System.out.println("Local Variable: " + localVar);
		 System.out.println("Instance Variable: " + instanceVar);
		 System.out.println("Static Variable: "+ staticVar);
	}
	
	

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
	}
}
		// TODO Auto-generated method stub

	
