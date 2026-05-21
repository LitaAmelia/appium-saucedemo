package stepdefinitions;

import config.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import java.io.ByteArrayInputStream;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) throws Exception {
        System.out.println("▶ Starting: " + scenario.getName());
        DriverManager.initDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Attach screenshot to Allure on failure
            byte[] screenshot = DriverManager.getDriver()
                    .getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(
                    "Screenshot on failure - " + scenario.getName(),
                    new ByteArrayInputStream(screenshot)
            );
        }
        DriverManager.quitDriver();
        System.out.println("⏹ Finished: " + scenario.getName() +
                " | Status: " + scenario.getStatus());
    }
}