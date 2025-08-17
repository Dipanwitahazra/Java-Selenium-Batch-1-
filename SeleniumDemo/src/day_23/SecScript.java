package day_23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
	 
	public class SecScript {
	 
		public static void main(String[] args) throws InterruptedException
		{
	 
			        // Set ChromeDriver path
			        System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\edgedriver_win64\\msedgedriver.exe");
			        // Create ChromeDriver instance
			        WebDriver driver = new EdgeDriver();
	 
			        // Open Google
			        driver.get("https://www.google.com");
			        Thread.sleep(2000);
			        
			        driver.get("https://www.bing.com");
			        Thread.sleep(2000);
			        
			        driver.get("https://www.yahoo.com");
			        Thread.sleep(2000);
	 
			      
			     
	 
			        // Close browser
			       driver.quit();
			        
			       // driver.close();
			    }
		}
	 
	 
	 
	 


