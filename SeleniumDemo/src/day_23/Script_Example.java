package day_23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class Script_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\geckodriver-v0.36.0-win32\\geckodriver.exe");
   	 
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new FirefoxDriver(options);
		 Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		 
		 String browserName = caps.getBrowserName();
		 String browserVersion = caps.getBrowserVersion();
		 
		 System.out.println("Browser Name: "+ browserName);
		// TODO Auto-generated method stub
		 System.out.println("Browser Version: "+ browserVersion);
		 driver.get("https://www.google.com");
		 
		 driver.quit();

	}

}


