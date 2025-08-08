package wd;

public class MethodDemo {
static int add(int a, int b) {
	return a + b;
	
}
int multiply(int a, int b) {
	return a * b;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = MethodDemo.add(10,5);
		System.out.println("Sum: " + sum);
		MethodDemo obj = new MethodDemo();
		int product = obj.multiply(3, 2);
		System.out.println("Product:" + product);

	}

}
