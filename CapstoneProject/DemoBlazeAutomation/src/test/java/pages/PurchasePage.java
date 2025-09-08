package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchasePage {

    WebDriver driver;
    WebDriverWait wait;

    public PurchasePage(WebDriver driver)throws InterruptedException  {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       Thread.sleep(1000);
        PageFactory.initElements(driver, this);
    }

    private void slowType(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        for (char c : text.toCharArray()) {
            element.sendKeys(Character.toString(c));
            try { Thread.sleep(200); 
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    public PurchasePage clickPlaceOrder()throws InterruptedException  {
        WebElement placeOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place Order']")));
        placeOrderBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModal")));
        Thread.sleep(1000);
        return this;
    }

    public PurchasePage fillOrderDetails(String name, String country, String city, String card, String month, String year) throws InterruptedException {
        slowType(By.id("name"), name);
        slowType(By.id("country"), country);
        slowType(By.id("city"), city);
        slowType(By.id("card"), card);
        slowType(By.id("month"), month);
        slowType(By.id("year"), year);
        Thread.sleep(1000);
        return this;
    }

    public PurchasePage clickPurchase() {
        WebElement purchaseBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Purchase']")));
        purchaseBtn.click();
        return this;
    }

    public String getOrderConfirmationText() {
        WebElement confirmText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sweet-alert > h2")));
        return confirmText.getText();
    }

    public void closeConfirmation() {
        try {
            
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement okBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
        okBtn.click();
    }
}
