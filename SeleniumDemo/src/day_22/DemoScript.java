package day_22;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	 
	 
	public class DemoScript {
		public static void main(String[] args) {
			try {
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.atlassian.com/software/jira");
	 
			driver.getTitle();
	 
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	 
			WebElement textBox = driver.findElement(By.id("wac-root"));
			
			System.out.println("Font size: "+textBox.getCssValue("font-size") + "\nText: "+textBox.getText());
			String text = driver.findElement(By.tagName("h1")).getText();
			System.out.println(text);
	        
				Thread.sleep(100000);
				
				
		        driver.quit();
		        
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	        
	        
	 
		}
	 
	}
	 
	




