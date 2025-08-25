package day_30;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class ConfigurableTest {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}
	@Test
	public void test1() {
		System.out.println("Runnung Test one");
	}
 
}

