package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.ProductsPage;

public class ProductsSteps {

    ProductsPage productsPage;
    private String currentProduct;

    @Given("User is on the Demoblaze homepage")
    public void user_on_homepage()throws InterruptedException  {
        productsPage = new ProductsPage(CommonSteps.driver);
        productsPage.goToHomepage();  
    }

    @When("User selects category {string}")
    public void user_selects_category(String category) throws InterruptedException {
        productsPage.selectCategory(category); 
    }

    @And("User selects product {string}")
    public void user_selects_product(String productName)throws InterruptedException  {
        productsPage.chooseProduct(productName); 
        currentProduct = productName;
    }

    @And("User adds product to cart")
    public void user_adds_product_to_cart()throws InterruptedException  {
        productsPage.addProductToCart();  
    }

    @Then("Product should be in the cart")
    public void product_should_be_in_cart() throws InterruptedException {
        boolean isInCart = productsPage.isProductInCart(currentProduct);  
        Assertions.assertTrue(isInCart, "Product " + currentProduct + " was not added to the cart!");
    }
}
