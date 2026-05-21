package pages;

import io.qameta.allure.Step;
import locators.LoginLocators;
import locators.ProductLocators;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage enterUsername(String username) {
        type(LoginLocators.USERNAME_FIELD, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(LoginLocators.PASSWORD_FIELD, password);
        return this;
    }

    public void tapLogin() {
        tap(LoginLocators.LOGIN_BUTTON);
    }


//    @Step("Get error message text")
//    public String getErrorMessage() {
//        return getText(LoginLocators.ERROR_MESSAGE);
//    }
//
//    // Fluent login helper
//    @Step("Login with email: {email}")
//    public void login(String email, String password) {
//        enterEmail(email)
//                .enterPassword(password)
//                .tapLogin();
//    }
}