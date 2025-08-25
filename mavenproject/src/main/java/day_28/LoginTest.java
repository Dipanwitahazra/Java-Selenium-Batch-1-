package day_28;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class LoginTest
{
WebDriver driver;
@BeforeClass
public void setup()
{
	System.out.println("Launching browser.....");
	driver=new ChromeDriver();
}
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Closing browser.....");
		driver.quit();
	}
 
}


