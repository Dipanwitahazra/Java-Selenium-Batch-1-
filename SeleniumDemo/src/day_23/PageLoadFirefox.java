package day_23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class PageLoadFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\geckodriver-v0.36.0-win32\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver driver = new FirefoxDriver(options);
		 try {
			 driver.get("https://www.google.com");
		 }
		 finally {
			 driver.close();
		 }
		

	}

}





