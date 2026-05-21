package pages;

import io.appium.java_client.AppiumBy;
import locators.ProductLocators;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class ProductsPage extends BasePage {

    public ProductsPage isProductPageDisplayed() {
        String textTitle = driver.findElement(ProductLocators.TITLE_PAGE).getText();
        Assert.assertEquals(textTitle, "PRODUCTS");
        return this;
    }

    public void scrollToAddToCart() {
        driver.executeScript("mobile: scroll", Map.of(
                "predicateString", "label == 'ADD TO CART'",
                "direction", "down"
        ));
    }

    public ProductsPage addProduct(String productName) {
        String product = String.format(ProductLocators.TEXT_PRODUCT, productName);
        tap(AppiumBy.xpath(product));
        scrollToAddToCart();
        tap(ProductLocators.BUTTON_ADD_TO_CART);
        tap(ProductLocators.BUTTON_BACK_TO_PRODUCTS);
        return this;
    }

    public void clickCart() {

        Map<String, Object> params = new HashMap<>();

        params.put("x", 355);
        params.put("y", 75);

        driver.executeScript("mobile: tap", params);
    }
}
