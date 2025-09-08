package stepdefinitions;
import org.junit.jupiter.api.Assertions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationPage reg;
    public static String username; 

    @When("User opens the registration modal")
    public void user_opens_registration_modal() {
        reg = new RegistrationPage(CommonSteps.driver);
        reg.openSignUpModal();

        
        WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(reg.getUsernameInput()));
    }

    @When("User enters username and password")
    public void user_enters_credentials() throws InterruptedException {
       
        username = CommonSteps.props.getProperty("username");
        reg.enterUsername(username);
        reg.enterPassword(CommonSteps.props.getProperty("password"));
    }

    @When("User clicks on register")
    public void user_clicks_register() {
        reg.clickRegister();
    }

    @Then("User should see a registration confirmation alert")
    public void user_sees_alert() {
        WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();

        
        Assertions.assertTrue(
            text.contains("Sign up successful") || text.contains("This user already exist"),
            "Unexpected alert text: " + text
        );
    }
}
