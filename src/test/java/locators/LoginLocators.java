package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class LoginLocators {

    public static final By USERNAME_FIELD    = AppiumBy.accessibilityId("test-Username");
    public static final By PASSWORD_FIELD    = AppiumBy.accessibilityId("test-Password");
    public static final By LOGIN_BUTTON      = AppiumBy.accessibilityId("test-LOGIN");
}
