# appium-SauceDemo
A mobile test automation framework for iOS applications built with Java, Appium, Cucumber (BDD), TestNG, and Allure Report — following the Page Object Model (POM) design pattern.

## ✅ Prerequisites

Make sure all of these are installed before setting up the project.

| Tool | Version | Install |
|------|---------|---------|
| macOS | Any (M1/M2/M3 supported) | — |
| Xcode | 14+ | Mac App Store |
| Xcode Command Line Tools | Latest | `xcode-select --install` |
| Java JDK | 11+ | [adoptium.net](https://adoptium.net) |
| Maven | 3.8+ | `brew install maven` |
| Node.js | 18+ | `brew install node` |
| Appium | 2.x | `npm install -g appium` |
| Appium XCUITest Driver | Latest | `appium driver install xcuitest` |
| Allure CLI | Latest | `brew install allure` |
| iOS Simulator | — | Included with Xcode |

## ⚙️ Setup

### 1. Clone the repository

```bash
git clone https://github.com/LitaAmelia/appium-playwright
```

### 2. Create local config file

> make `config.properties` in src/test/resources/config.properties the values can be copy in `config.example.properties`

### 3. Install Maven dependencies

```bash
mvn clean install -DskipTests
```

## 🚀 Running Tests

### Start Appium server (in a separate terminal)

```bash
appium
```

### Boot iOS Simulator (if not already running)

```bash
# List available simulators
xcrun simctl list devices
 
# Boot your target simulator
xcrun simctl boot "iPhone 14"
 
# Open Simulator app
open -a Simulator
```

### Run all tests

```bash
mvn clean test
```

## 📊 Allure Report

### Option A — Serve live (opens browser automatically)

```bash
allure serve allure-results
```

## 🎥 Test Execution Demo

[![Watch on YouTube](https://img.youtube.com/vi/NrLBc4cnOMc/maxresdefault.jpg)](https://youtu.be/NrLBc4cnOMc)
 
