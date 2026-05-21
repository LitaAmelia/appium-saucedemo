package pages;

import locators.CompleteOrderLocator;
import org.testng.Assert;

public class CompleteOrderPage extends BasePage{
    public CompleteOrderPage verifyOrderSuccess(String message) {
        String actualText = driver.findElement(CompleteOrderLocator.TEXT_SUCCESS_ORDER).getText();
        Assert.assertEquals(actualText, message);
        return this;
    }
}
