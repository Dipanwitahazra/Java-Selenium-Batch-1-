package day_25;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class BookAppointment {
    public static void main(String[] args) throws InterruptedException {
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");

       
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); 

        WebDriver driver = new ChromeDriver(options);

        try {
            
            driver.get("https://360homedecor.uk/book-appointment");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

          
            try {
                WebElement iframe = driver.findElement(By.tagName("iframe"));
                driver.switchTo().frame(iframe);
            } catch (Exception e) {
             
            }

         
            WebElement branchElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("choose_branch")));
            new Select(branchElement).selectByVisibleText("Veneer");
            Thread.sleep(1000);
          
            WebElement styleElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("choose_style")));
            new Select(styleElement).selectByVisibleText("Contemporary");
            Thread.sleep(1000);

           
            driver.findElement(By.id("first_name")).sendKeys("");
            Thread.sleep(1000);
            driver.findElement(By.id("last_name")).sendKeys("");
            Thread.sleep(1000);
            driver.findElement(By.id("apt_city")).sendKeys("");
            Thread.sleep(1000);
            driver.findElement(By.id("phone_number")).sendKeys("");
            Thread.sleep(1000);
            driver.findElement(By.id("email")).sendKeys("");
            Thread.sleep(1000);

            
            WebElement fileInput = driver.findElement(By.id("layoutFiles"));
            fileInput.sendKeys("C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\Screenshot (80).png");
            Thread.sleep(3000);

          
            WebElement privacyCheckbox = driver.findElement(By.id("privacyPolicy"));
            if (!privacyCheckbox.isSelected()) {
                privacyCheckbox.click();
            }
            Thread.sleep(2000);

         
            driver.findElement(By.id("submit")).click();
            

          
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmation")));
          
            System.out.println("Appointment booked successfully!");

         
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
