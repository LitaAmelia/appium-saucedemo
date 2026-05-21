package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductLocators {

    public static final By TITLE_PAGE               = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"PRODUCTS\"]");
    public static final String TEXT_PRODUCT         = "//XCUIElementTypeStaticText[@name=\"test-Item title\" and @label='%s']";
    public static final By BUTTON_ADD_TO_CART       = AppiumBy.accessibilityId("test-ADD TO CART");
    public static final By BUTTON_BACK_TO_PRODUCTS  = AppiumBy.accessibilityId("test-BACK TO PRODUCTS");
    public static final By BUTTON_CART              = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == 'test-Cart'`]");
}
