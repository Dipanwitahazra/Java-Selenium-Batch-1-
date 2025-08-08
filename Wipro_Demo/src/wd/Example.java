package wd;

public class Example {
	static void showStatic() {
		System.out.println("Hello");
	}
     void showInstance() {
    	 System.out.println("hii");
     }
     
     
	public static void main(String[] args) {
		Example.showStatic();
		Example obj = new Example();
		obj.showInstance();
		// TODO Auto-generated method stub

	}

}
