package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="login2")
    WebElement loginButton;

    @FindBy(id="loginusername")
    WebElement usernameInput;

    @FindBy(id="loginpassword")
    WebElement passwordInput;

    @FindBy(css="#logInModal .btn-primary")
    WebElement loginBtnModal;

    @FindBy(id="nameofuser")
    WebElement loggedInUserLabel; 

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openLoginModal() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void enterUsername(String username) throws InterruptedException {
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

    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtnModal)).click();
    }

    public String getLoggedInUserText()throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loggedInUserLabel));
        Thread.sleep(500);
        return loggedInUserLabel.getText();
    }

    public WebElement getUsernameField() {
        return usernameInput;
    }

    public WebElement getLoggedInUserElement() {
        return loggedInUserLabel;
    }
}
