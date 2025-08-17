package day_25;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

public class OrientationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Page URL: " + url);
		PrintOptions printOptions = new PrintOptions();
		printOptions.setOrientation(PrintOptions.Orientation.LANDSCAPE);
		
		PrintOptions.Orientation currentOrinetation = printOptions.getOrientation();
		System.out.println("Current Orientation: " + currentOrinetation);
		
		 printOptions.setPageRanges("1-2");
	        String[] current_range = printOptions.getPageRanges();
	        
	        System.out.println(Arrays.toString(current_range));
		
		driver.quit();
	}
}
		
		