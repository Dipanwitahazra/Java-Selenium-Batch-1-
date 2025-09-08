package stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import utils.DriverManager;

public class CommonSteps {
    public static WebDriver driver;
    public static Properties props;

    @Before
    public void setUp() throws IOException {
        driver = DriverManager.getDriver();

        props = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        props.load(fis);

      
        driver.get(props.getProperty("url"));
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}


