package day_27;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonEx {
	
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void Amazon_site() {
        driver.get("https://www.amazon.in/");
    }

    @Test(priority = 0)
    public void Amazon_login() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        String email = prop.getProperty("email");
        String password = prop.getProperty("password");

        // Click Sign in
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList"))).click();

        // Enter email
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login"))).sendKeys(email);
        driver.findElement(By.id("continue")).click();

        // Enter password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password"))).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Test(priority = 1)
	public void Amazon_pro_search() throws InterruptedException {
		List<String> products = new ArrayList<>();
		  products.add("Exo Dishwash Bar");
		  products.add("Soap");
		  products.add("Tooth paste");
		  		  
		  for (String prod : products) {
		  
		  WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		  searchBox.clear();
		  searchBox.sendKeys(prod);
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  Thread.sleep(3000);
		  		  
		  WebElement addToCartBtn = driver.findElement(By.cssSelector("#a-autoid-3-announce"));
		  addToCartBtn.click();
		  Thread.sleep(3000);
		  }
		

		  driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[8]/div[1]/div/div/div[2]/div/div[2]/span/span/a")).click();
	        Thread.sleep(2000);
	
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span[1]/span/span/input")).click();
	        Thread.sleep(2000);
	
			driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/span/div/label/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[6]/div/div/div/div/div[1]/div/label/input")).click();
			Thread.sleep(2000);
			
			
			
		
			
	}
}
