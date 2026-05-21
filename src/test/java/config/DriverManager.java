package config;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static IOSDriver driver;

    public static IOSDriver getDriver() {
        return driver;
    }

    public static void initDriver() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions()
                .setDeviceName(ConfigReader.deviceName())
                .setPlatformVersion(ConfigReader.platformVersion())
                .setApp(ConfigReader.appPath())           // installs the .app
                .setAutomationName(ConfigReader.automationName())
                .setNoReset(ConfigReader.noReset())
                .setFullReset(ConfigReader.fullReset());

        // Only set bundleId if app path is NOT provided (launching pre-installed app)
        String appPath = ConfigReader.appPath();
        if (appPath == null || appPath.isBlank()) {
            options.setBundleId(ConfigReader.bundleId());
        }

        driver = new IOSDriver(
                new URL(ConfigReader.appiumServerUrl()),
                options
        );

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(ConfigReader.implicitWait()));
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
