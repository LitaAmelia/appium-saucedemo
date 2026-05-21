package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

import java.util.List;

public class CheckoutSteps {

    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();
    private final InformationPage informationPage = new InformationPage();
    private final CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    private final CompleteOrderPage completeOrderPage = new CompleteOrderPage();

    @And("User logged into SauceDemo")
    public void userLoggedIntoSauceDemo() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.tapLogin();
        productsPage.isProductPageDisplayed();
    }

    @When("User add product {string} to cart")
    public void userAddProductToCart(String productName) {
        productsPage.addProduct(productName);
    }

    @And("User click cart icon")
    public void userClickCartIcon() {
        productsPage.clickCart();
        cartPage.isCartPageDisplayed();
    }

    @Then("User should be redirected to the Cart page")
    public void userShouldBeRedirectedToTheCartPage() {
        cartPage.isCartPageDisplayed();
    }

    @Then("User should see products in cart")
    public void userShouldSeeProductsInCart(List<String> products) {
        for (String product : products) {

            Assert.assertTrue(
                    cartPage.isProductDisplayedInCart(product),
                    "Product not found: " + product
            );
        }
    }

    @When("User click checkout button")
    public void userClickCheckoutButton() {
        cartPage.clickButtonCheckout();
        informationPage.isInformationPageDisplayed();
    }

    @And("User input first name {string}")
    public void userInputFirstName(String firstName) {
        informationPage.inputFirstName(firstName);
    }

    @And("User input last name {string}")
    public void userInputLastName(String lastName) {
        informationPage.inputLastName(lastName);
    }

    @And("User input postal code {string}")
    public void userInputPostalCode(String zipCode) {
        informationPage.inputZipCode(zipCode);
    }

    @And("User click continue button")
    public void userClickContinueButton() {
        informationPage.clickButtonContinue();
    }

    @Then("User should be redirected to the Checkout Overview page")
    public void userShouldBeRedirectedToTheCheckoutOverviewPage() {
        checkoutOverviewPage.isCheckoutOverviewPageDisplayed();
    }


    @When("User click finish button")
    public void userClickFinishButton() {
        checkoutOverviewPage.clickButtonFinish();
    }

    @Then("User see checkout complete message {string}")
    public void userSeeCheckoutCompleteMessage(String message) {
        completeOrderPage.verifyOrderSuccess(message);
    }

}
