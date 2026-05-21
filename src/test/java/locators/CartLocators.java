package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CartLocators {
    public static final By TEXT_TITLE               = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"YOUR CART\"]");
    public static final By BUTTON_CONTINUE_SHOPPING = AppiumBy.accessibilityId("test-CONTINUE SHOPPING");
    public static final By BUTTON_CHECKOUT          = AppiumBy.accessibilityId("test-CHECKOUT");
    public static final String TEXT_PRODUCT_CART    = "//XCUIElementTypeStaticText[@label='%s']";
}
