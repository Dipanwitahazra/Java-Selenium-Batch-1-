package day_24;
import java.time.Duration;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriResumeUpload {

	public static void main(String[] args)throws IOException,InterruptedException{
		Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\personal.properties");
        props.load(fis);
 
        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");
 
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://www.naukri.com/nlogin/login");

        driver.findElement(By.id("usernameField")).sendKeys("");
        driver.findElement(By.id("passwordField")).sendKeys("");

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();

        Thread.sleep(5000);

        driver.get("https://www.naukri.com/mnjuser/profile");

        Thread.sleep(5000);

        WebElement uploadBtn = driver.findElement(By.id("attachCV"));
        uploadBtn.sendKeys("C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\resume.pdf");

        System.out.println("Resume Uploaded Successfully!");

        Thread.sleep(6000);
      //  driver.quit();
    }
}

