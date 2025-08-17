package day_23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class ScriptEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new EdgeDriver(options);
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

