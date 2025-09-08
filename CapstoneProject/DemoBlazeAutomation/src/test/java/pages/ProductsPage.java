package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

     public void goToHomepage() throws InterruptedException{
        driver.navigate().to("https://www.demoblaze.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbodyid")));
        Thread.sleep(2000);
    }

    public void selectCategory(String category) throws InterruptedException{
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement categoryLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(category)));
                categoryLink.click();

               
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#tbodyid .card-title a")));
                Thread.sleep(2000);
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                attempts++;
            }
        }
    }

      public void chooseProduct(String productName) throws InterruptedException{
        boolean found = false;
        int attempts = 0;
        while (!found && attempts < 3) {
            try {
               List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.cssSelector("#tbodyid .card-title a")));

                for (WebElement product : products) {
                    if (product.getText().equalsIgnoreCase(productName)) {
                        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
                        found = true;
                        Thread.sleep(2000);
                        break;
                    }
                }

                if (!found) throw new RuntimeException("Product not found: " + productName);

            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                attempts++;
            }
        }
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add to cart']")));
    }
   public void addProductToCart() throws InterruptedException{
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']")));
        addToCartBtn.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
         goToHomepage();
    }
    public void goToCart()throws InterruptedException {
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
        cartLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbodyid")));
      Thread.sleep(2000);
    }
    public boolean isProductInCart(String productName)throws InterruptedException {
        goToCart();
        List<WebElement> products = driver.findElements(By.cssSelector("#tbodyid .success td:nth-child(2)"));
        for (WebElement product : products) {
            if (product.getText().equalsIgnoreCase(productName)) return true;
        }
        return false;
    }
}
