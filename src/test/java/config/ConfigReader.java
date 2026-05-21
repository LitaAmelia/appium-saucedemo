package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();
    private static final String CONFIG_PATH =
            "src/test/resources/config.properties";

    // Load once when class is initialized
    static {
        try (InputStream input = new FileInputStream(CONFIG_PATH)) {
            properties.load(input);
            System.out.println("✅ config.properties loaded successfully");
        } catch (IOException e) {
            throw new RuntimeException(
                    "❌ config.properties not found at: " + CONFIG_PATH +
                            "\n   Copy config.example.properties → config.properties and fill in your values.",
                    e
            );
        }
    }

    // ── Generic getter ──────────────────────────────────────────────
    public static String get(String key) {
        String value = properties.getProperty(key);
        if (value == null || value.isBlank()) {
            throw new RuntimeException(
                    "❌ Missing required property: '" + key + "' in config.properties"
            );
        }
        return value.trim();
    }

    public static String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue).trim();
    }

    // ── Typed getters ───────────────────────────────────────────────
    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }

    // ── Named getters (clean API for DriverManager) ─────────────────
    public static String appiumServerUrl()  { return get("appium.server.url"); }
    public static String deviceName()       { return get("device.name"); }
    public static String platformName()     { return get("platform.name"); }
    public static String platformVersion()  { return get("platform.version"); }
    public static String automationName()   { return get("automation.name"); }
    public static String appPath()          { return get("app.path"); }
    public static String bundleId()         { return get("bundle.id"); }
    public static boolean noReset()         { return getBoolean("no.reset"); }
    public static boolean fullReset()       { return getBoolean("full.reset"); }
    public static int implicitWait()        { return getInt("implicit.wait"); }
    public static int explicitWait()        { return getInt("explicit.wait"); }
}