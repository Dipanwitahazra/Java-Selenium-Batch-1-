package day_30;

import org.testng.annotations.Test;

public class TestClassOne {
	@Test
	public void testMethodOne()
	{
		System.out.println("Executing TestClassOne.testMethodOne");
	}
	public class TestClassTwo{
		@Test
		public void testMethodTwo() {
			
		System.out.println("Executing TestClassTwo.testMethodTwo");
	}
		
		
	}

}
