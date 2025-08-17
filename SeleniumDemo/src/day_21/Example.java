package day_21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
	 
	public class Example{
	 
		public static void main(String[] args)
		{
	 
			        // Set ChromeDriver path
			        System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\edgedriver_win64\\msedgedriver.exe");
			        		
			        // Create ChromeDriver instance
			        WebDriver driver = new EdgeDriver();
	 
			        // Open Google
			        driver.get("https://www.google.com");
	 
			        // Print title
			      System.out.println("Page Title: " + driver.getTitle());
	 
			        // Close browser
			       // driver.quit();
			        
			        driver.close();
			    }
		}
	 
	 
	 
	 






