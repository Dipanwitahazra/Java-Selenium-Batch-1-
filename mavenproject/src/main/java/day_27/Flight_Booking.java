package day_27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class Flight_Booking {

    WebDriver driver;

    
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

   
    @DataProvider(name = "cityPairs")
    public Object[][] getCityPairs() {
        return new Object[][]{
                {"Paris", "London"},
                {"Boston", "Berlin"},
                {"Philadelphia", "Rome"}
        };
    }

    
    @Test(dataProvider = "cityPairs", priority = 1)
    public void bookFlight(String fromCity, String toCity) throws Exception {
        // Open site
        driver.get("https://blazedemo.com/");
        Thread.sleep(2000);

      
        driver.findElement(By.name("fromPort")).sendKeys(fromCity);
        Thread.sleep(1000);
        driver.findElement(By.name("toPort")).sendKeys(toCity);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);

      
        driver.findElement(By.cssSelector("table tbody tr:nth-child(1) td input")).click();
        Thread.sleep(2000);

   
        driver.findElement(By.id("inputName")).sendKeys("Dipanwita Hazra");
        Thread.sleep(1000);
        driver.findElement(By.id("address")).sendKeys("West Bengal");
        Thread.sleep(1000);
        driver.findElement(By.id("city")).sendKeys("Kolkata");
        driver.findElement(By.id("state")).sendKeys("West Bengal");
        driver.findElement(By.id("zipCode")).sendKeys("721603");

     
        driver.findElement(By.id("creditCardNumber")).sendKeys("1234567891245382");
        driver.findElement(By.id("creditCardMonth")).clear();
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");
        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2027");
        driver.findElement(By.id("nameOnCard")).sendKeys("Dipanwita Hazra");

       
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(3000);

       
        WebElement confirmation = driver.findElement(By.tagName("h1"));
        assert confirmation.getText().contains("Thank you") : "Booking failed!";
    }
}



