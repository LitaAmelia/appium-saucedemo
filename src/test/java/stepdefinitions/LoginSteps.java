package stepdefinitions;

import io.cucumber.java.en.*;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();
    private final ProductsPage productsPage = new ProductsPage();

    @Given("the app is launched")
    public void theAppIsLaunched() {
        // Driver is initialized in Hooks @Before
        System.out.println("App launched successfully");
    }

    @When("the user enters username {string}")
    public void theUserEntersUsername(String username) {
        loginPage.enterUsername(username);
    }

    @When("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user taps the login button")
    public void theUserTapsLoginButton() {
        loginPage.tapLogin();
    }

    @Then("the welcome screen should be displayed")
    public void theWelcomeScreenShouldBeDisplayed() {
        productsPage.isProductPageDisplayed();
    }
}
