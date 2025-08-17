package day_23;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PageLoadEdge {

    public static void main(String[] args) {
        WebDriver driver = null;  
        try {
           
            System.setProperty("webdriver.edge.driver","C:\\Users\\USER\\OneDrive\\Desktop\\JavaSelenium\\edgedriver_win64\\msedgedriver.exe");

            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);

            driver = new EdgeDriver(options);

            driver.get("https://www.google.com");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit(); 
            }
        }
    }
}