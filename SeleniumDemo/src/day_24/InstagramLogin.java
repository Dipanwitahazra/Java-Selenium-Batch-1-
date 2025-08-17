package day_24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstagramLogin {
    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");

      
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.instagram.com/accounts/login/");

        
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           
            WebElement usernameField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("username"))
            );

          
            usernameField.sendKeys("");
            driver.findElement(By.name("password")).sendKeys("");

           
            driver.findElement(By.xpath("//button[@type='submit']")).click();

           
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[contains(@class,'x9f619')]//img")
            ));

            System.out.println("Login successful!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
    }
}



