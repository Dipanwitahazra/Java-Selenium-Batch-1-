package day_25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntralogin {
    public static void main(String[] args) throws InterruptedException {
        

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.myntra.com/login");

        
        driver.findElement(By.id("nav-link-accountList")).click();

       
        driver.findElement(By.id("ap_phone_number")).sendKeys("9832649823");
        

       
        driver.findElement(By.id("ap_otp")).sendKeys("your_otp_here");
        driver.findElement(By.id("signInSubmit")).click();

        Thread.sleep(3000); 

        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone 13");  
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000);

        
        driver.findElement(By.cssSelector("div[data-index='1'] h2 a")).click();

        
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        Thread.sleep(2000);

        
        driver.findElement(By.id("add-to-cart-button")).click();

        System.out.println("Item added to cart successfully ");

        Thread.sleep(3000);
        driver.quit();
    }
}
