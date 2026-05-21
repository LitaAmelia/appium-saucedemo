package pages;

import io.appium.java_client.AppiumBy;
import locators.ProductLocators;
import org.openqa.selenium.By;
import locators.CartLocators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Map;



public class CartPage extends BasePage{

    public void scrollToButtonCheckout() {
        driver.executeScript("mobile: scroll", Map.of(
                "predicateString", "label == 'CHECKOUT'",
                "direction", "down"
        ));
    }

    public CartPage isCartPageDisplayed() {
        String textTitle = driver.findElement(CartLocators.TEXT_TITLE).getText();
        Assert.assertEquals(textTitle, "YOUR CART");
        return this;
    }

    public boolean isProductDisplayedInCart(String productName) {
        By productLocator = AppiumBy.xpath(
                String.format(
                        CartLocators.TEXT_PRODUCT_CART,
                        productName
                )
        );
        return !driver.findElements(productLocator).isEmpty();
    }

    public void clickButtonCheckout() {
        scrollToButtonCheckout();
        tap(CartLocators.BUTTON_CHECKOUT);
    }
}
