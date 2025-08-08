package wd;

public class Rectangle {
	static String shapeName = "Rectangle";// static variable
	int length = 6; // instance variable
	int breadth = 5; // instance variable
	void calculateArea() {
		int area = length * breadth; // Local variable
		System.out.println("Shape " + shapeName);
		System.out.println("Area: " + area);
	}
	
	

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.calculateArea();
		
		// TODO Auto-generated method stub

	}

}
