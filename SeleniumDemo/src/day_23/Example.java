package day_23;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class Example {
    public static void main(String[] args) throws InterruptedException {
    	// System.setProperty("webdriver.chrome.driver","C:\Users\USER\OneDrive\Desktop\JavaSelenium\chromedriver-win64\\chromedriver.exe");
    	 
 
        WebDriver driver = new ChromeDriver();
 
        
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
 