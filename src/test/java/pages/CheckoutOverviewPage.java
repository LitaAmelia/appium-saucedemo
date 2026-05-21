package pages;

import locators.CheckoutOverviewLocators;
import org.testng.Assert;

import java.util.Map;

public class CheckoutOverviewPage extends BasePage {

    public void scrollToButtonFinish() {
        driver.executeScript("mobile: scroll", Map.of(
                "predicateString", "label == 'FINISH'",
                "direction", "down"
        ));
    }

    public CheckoutOverviewPage isCheckoutOverviewPageDisplayed() {
        String textTitle = driver.findElement(CheckoutOverviewLocators.TEXT_TITLE).getText();
        Assert.assertEquals(textTitle, "CHECKOUT: OVERVIEW");
        scrollToButtonFinish();
        driver.findElement(CheckoutOverviewLocators.TEXT_PAYMENT_INFORMATION);
        driver.findElement(CheckoutOverviewLocators.TEXT_SHIPPING_INFORMATON);
        driver.findElement(CheckoutOverviewLocators.BUTTON_CANCEL);
        driver.findElement(CheckoutOverviewLocators.BUTTON_FINISH);
        return this;
    }

    public void clickButtonFinish() {
        tap(CheckoutOverviewLocators.BUTTON_FINISH);
    }
}
