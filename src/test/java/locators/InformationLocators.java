package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class InformationLocators {
    public static By TEXT_TITLE         = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"CHECKOUT: INFORMATION\"]");
    public static By FIELD_FIRST_NAME   = AppiumBy.accessibilityId("test-First Name");
    public static By FIELD_LAST_NAME    = AppiumBy.accessibilityId("test-Last Name");
    public static By FIELD_ZIP_CODE     = AppiumBy.accessibilityId("test-Zip/Postal Code");
    public static By BUTTON_CANCEL      = AppiumBy.accessibilityId("test-CANCEL");
    public static By BUTTON_CONTINUE    = AppiumBy.accessibilityId("test-CONTINUE");
}
