package pages;

import locators.InformationLocators;
import org.testng.Assert;

public class InformationPage extends BasePage{
    public InformationPage isInformationPageDisplayed() {
        String textTitle = driver.findElement(InformationLocators.TEXT_TITLE).getText();
        Assert.assertEquals(textTitle, "CHECKOUT: INFORMATION");
        driver.findElement(InformationLocators.BUTTON_CANCEL);
        driver.findElement(InformationLocators.BUTTON_CONTINUE);
        return this;
    }

    public InformationPage inputFirstName(String firstName) {
        type(InformationLocators.FIELD_FIRST_NAME, firstName);
        return this;
    }

    public InformationPage inputLastName(String lastName) {
        type(InformationLocators.FIELD_LAST_NAME, lastName);
        return this;
    }

    public InformationPage inputZipCode(String zipCode) {
        type(InformationLocators.FIELD_ZIP_CODE, zipCode);
        return this;
    }

    public void clickButtonContinue() {
        tap(InformationLocators.BUTTON_CONTINUE);
    }
}
