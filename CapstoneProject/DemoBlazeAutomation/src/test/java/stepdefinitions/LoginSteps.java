package stepdefinitions;
import org.junit.jupiter.api.Assertions;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import pages.LoginPage;

public class LoginSteps {
    LoginPage login;

    @When("User opens the login modal")
    public void user_opens_login_modal() {
        login = new LoginPage(CommonSteps.driver);
        login.openLoginModal();

        WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(login.getUsernameField()));
    }

    @When("User enters username and password for login")
    public void user_enters_login_credentials() throws InterruptedException {
        login.enterUsername(RegistrationSteps.username);
        login.enterPassword(CommonSteps.props.getProperty("password"));
    }

    @When("User clicks on login")
    public void user_clicks_login() {
        login.clickLogin();

        WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(login.getLoggedInUserElement()));
    }

    @Then("User should be logged in successfully")
    public void user_logged_in_successfully()throws InterruptedException  {
        String welcomeText = login.getLoggedInUserText();
        Assertions.assertTrue(welcomeText.contains(RegistrationSteps.username),
            "Login failed or username not displayed");
    }
}
