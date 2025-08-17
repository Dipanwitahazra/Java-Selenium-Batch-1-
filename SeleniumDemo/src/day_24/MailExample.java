package day_24;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MailExample {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = null; 

        try {
            
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);

            String email = prop.getProperty("email");
            String password = prop.getProperty("password");

        
            System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");

       
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

           
            driver.get("https://mail.google.com");

         
            WebElement emailField = driver.findElement(By.id("identifierId"));
            emailField.sendKeys(email);
            driver.findElement(By.id("identifierNext")).click();

         
            Thread.sleep(2000);
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys(password);
            driver.findElement(By.id("passwordNext")).click();

            Thread.sleep(5000);
            System.out.println("Login attempt completed.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}