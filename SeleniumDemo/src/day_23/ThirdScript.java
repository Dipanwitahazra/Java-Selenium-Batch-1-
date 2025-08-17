package day_23;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class ThirdScript {
    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\geckodriver-v0.36.0-win32\\geckodriver.exe");
    	 
 
        WebDriver driver = new FirefoxDriver();
 
        
        driver.manage().window().maximize();
        System.out.print("hello");
 
       
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        
        System.out.print("hello");
        
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        
//        driver.get("www.youtube.com");
        
        driver.get("https://www.youtube.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
 


