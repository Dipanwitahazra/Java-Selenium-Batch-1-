package day_27;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SocialMediaExample {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.get("https://www.instagram.com/");

        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys(""); 
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
}
    @Test(priority = 2)
    public void createPostTest() throws InterruptedException {
        String postMessage = "Automated test post " + System.currentTimeMillis();

      
        WebElement newPostBtn=driver.findElement(By.xpath("//*[@id=\"mount_0_0_xT\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[7]/div/span/div/a/div/div[1]/div/div"));
        newPostBtn.click();
        Thread.sleep(2000);
      
        WebElement uploadInput = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[3]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/button"));
        uploadInput.sendKeys("C:\\Users\\USER\\Downloads\\JavaSelenium.jpg"); 
        Thread.sleep(4000);

       
        driver.findElement(By.xpath("//button[text()='Next']")).click();
        Thread.sleep(2000);
}
}