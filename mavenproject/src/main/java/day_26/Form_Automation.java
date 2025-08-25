package day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Dipanwita");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Hazra");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9578421785");
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.className("react-datepicker__month-select")).click();
		 
		driver.findElement(By.xpath("//option[text()='December']")).click();
		Thread.sleep(3000);
		 
		driver.findElement(By.className("react-datepicker__year-select")).click();
		 
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[6]")).click();
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("English");
		sub.sendKeys(Keys.DOWN, Keys.ENTER);
		driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\USER\\OneDrive\\Pictures\\Screenshots\\Screenshot (80).png");
		driver.findElement(By.id("currentAddress")).sendKeys("Haldia,West Bengal");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("Haryana");
		state.sendKeys(Keys.DOWN, Keys.ENTER);
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Karnal");
		city.sendKeys(Keys.DOWN, Keys.ENTER);
	
		
		driver.findElement(By.id("submit")).click();
		System.out.println("Form submitted Successfully");
		Thread.sleep(2000);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
