package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PurchasePage;

import java.time.Duration;

public class PurchaseSteps {

    PurchasePage purchasePage;
    WebDriverWait wait;

    @Given("User is on the cart page")
    public void user_on_cart_page()throws InterruptedException  {
        purchasePage = new PurchasePage(CommonSteps.driver);
        wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(30));

      
        CommonSteps.driver.findElement(By.id("cartur")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbodyid")));
    }

    @When("User places an order with name {string}, country {string}, city {string}, card {string}, month {string}, year {string}")
    public void user_places_order(String name, String country, String city, String card, String month, String year) throws InterruptedException {

        purchasePage.clickPlaceOrder();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModal")));

        purchasePage.fillOrderDetails(name, country, city, card, month, year);

        purchasePage.clickPurchase();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sweet-alert")));
    }

    @Then("User should see order confirmation")
    public void user_should_see_order_confirmation() {
        
        String confirmation = purchasePage.getOrderConfirmationText();
        Assertions.assertTrue(confirmation.contains("Thank you for your purchase"), "Order not confirmed!");
        purchasePage.closeConfirmation();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".sweet-alert")));
    }
}
