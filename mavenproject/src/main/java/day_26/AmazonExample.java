package day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AmazonExample {
    public static void main(String[] args) throws InterruptedException, IOException {

      
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        String email = prop.getProperty("email");
        String password = prop.getProperty("password");

     
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
       
        driver.get("https://www.amazon.in/");

    
        driver.findElement(By.id("nav-link-accountList")).click();

       
        driver.findElement(By.id("ap_email_login")).sendKeys(email);
        driver.findElement(By.id("continue")).click();

     
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();

     
        String[] items = {"laptop bag", "headphones", "keyboard"};

        for (String item : items) {
         
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(item);
            driver.findElement(By.id("nav-search-submit-button")).click();
            
            driver.findElement(By.cssSelector("#a-autoid-3-announce")).click();
         
            for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }

           
            try {
                driver.findElement(By.id("add-to-cart-button")).click();
                System.out.println("Added: " + item);
                Thread.sleep(1000);
            } catch (Exception e1) {
                try {
                  
                    driver.findElement(By.id("buy-now-button")).click();
                    System.out.println("Buy Now instead for: " + item);
                } catch (Exception e2) {
                    
                }
            }

          
            driver.get("https://www.amazon.in/");
        }
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.name("proceedToRetailCheckout")).click();
            System.out.println("Proceeded to Checkout Page!");
        } catch (Exception e) {
            System.out.println(" Could not proceed to checkout.");
        }

        // Stop here (do not place order!)
        Thread.sleep(5000);

        System.out.println(" All items processed & checkout reached.");
        driver.quit();
    }
}
