package wd;
abstract class Shape{
	abstract double area();
}
class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
		
		
		
	double area() {
		return Math.PI * radius * radius;
	}
	}
		
	
public class ShapeMain {

	public static void main(String[] args) {
		Shape myCircle =  new Circle(5);
		System.out.println("Area of Circle: " + myCircle.area());
	}
}
		// TODO Auto-generated method stub

	
