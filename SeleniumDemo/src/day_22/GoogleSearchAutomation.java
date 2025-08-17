package day_22;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class GoogleSearchAutomation {
	public static void main(String[] args)
	{
 
		        // Set ChromeDriver path
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");
 
		        // Create ChromeDriver instance
		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.google.com");
		        
		        WebElement searchbox=driver.findElement(By.name("q"));
		          searchbox.sendKeys("Techandemy");
		          searchbox.submit();
		          try {
		          Thread.sleep(200000);
		          }catch(Exception e) {
		          e.printStackTrace();
		          }
		        System.out.println("Page Title: " + driver.getTitle());
		 
		          // Close browser
		         // driver.quit();
		          
		        //  driver.close();
		      }
		 }


