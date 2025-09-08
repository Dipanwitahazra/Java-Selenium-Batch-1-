package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {
    WebDriver driver;

    @FindBy(id="signin2")
    WebElement signUpButton;

    @FindBy(id="sign-username")
    WebElement usernameInput;

    @FindBy(id="sign-password")
    WebElement passwordInput;

    @FindBy(css="#signInModal .btn-primary")
    WebElement registerBtnModal;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openSignUpModal() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void enterUsername(String username)throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        Thread.sleep(1000);
        usernameInput.clear();
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password)throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        Thread.sleep(1000);
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickRegister() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(registerBtnModal)).click();
    }

    public WebElement getUsernameInput() {
        return usernameInput;
    }
}
