package day_24;
import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Facebooklogin {

	public static void main(String[] args) {
		 String email = "";
	        String password = "";
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");

	        
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");

	        WebDriver driver = new ChromeDriver(options);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        try {
	            
	            driver.get("https://www.facebook.com/");
	            driver.manage().window().maximize();
	            
	            WebElement emailField = wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	            emailField.sendKeys(email);

	            
	            WebElement passField = driver.findElement(By.id("pass"));
	            passField.sendKeys(password);

	          
	            driver.findElement(By.name("login")).click();

	          
	            wait.until(ExpectedConditions.urlContains("facebook.com"));

	            System.out.println("Facebook login successful!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}





	