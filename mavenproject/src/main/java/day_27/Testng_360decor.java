package day_27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Testng_360decor {
	
 WebDriver driver;
 @BeforeClass
 public void Setup() {
  
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  
 }
@BeforeMethod
 public void Home_Decor() {
  
  driver.get("https://360homedecor.uk");
  String title=driver.getTitle();
  System.out.println("Page Title is : " + title);
 }

}