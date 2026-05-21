package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CheckoutOverviewLocators {
    public static By TEXT_TITLE                 = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"CHECKOUT: OVERVIEW\"]");
    public static By TEXT_PAYMENT_INFORMATION   = AppiumBy.accessibilityId("Payment Information:");
    public static By TEXT_SHIPPING_INFORMATON   = AppiumBy.accessibilityId("Shipping Information:");
    public static By BUTTON_CANCEL              = AppiumBy.accessibilityId("test-CANCEL");
    public static By BUTTON_FINISH              = AppiumBy.accessibilityId("test-FINISH");
}
