package stepdefinitions;
import io.cucumber.java.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    @Before
    public void setup() {
        WebDriver driver = CommonSteps.driver;
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.demoblaze.com");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(d -> d.findElement(By.id("tbodyid")));
    }
}

