package wd;

public class Counter {
	static int count = 0; // static variable
	int instanceValue = 10; //instance variable
	void increment() {
		int localIncrement = 5; //Local variable
		instanceValue += localIncrement;
		count++;
		System.out.println("Instance value: " + instanceValue);
		System.out.println("Static Count: " + count);
	}
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.increment();
		c2.increment();
	}
}

	

	