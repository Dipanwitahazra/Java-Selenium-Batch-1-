package day_25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FlipkartLogin {
    public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");
      
        WebDriver driver = new ChromeDriver();

      
        driver.manage().window().maximize();

     
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
        driver.get("https://www.flipkart.com/");

        
        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed.");
        }

       
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

       
        WebElement mobileNumberField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        mobileNumberField.sendKeys("9832649823");

       
        driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();

       
        System.out.println("Please enter OTP manually within 30 seconds...");
        Thread.sleep(30000); 

      
        try {
            WebElement profileIcon = driver.findElement(By.xpath("//div[@class='_1ruvv2']"));
            if (profileIcon.isDisplayed()) {
                System.out.println("Login successful!");
            }
        } catch (Exception e) {
            System.out.println("Login failed or OTP not entered.");
        }

        
        driver.quit();
    }
}
