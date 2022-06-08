package com.onefi.carbon;

import com.google.common.io.Files;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static final String APP_ID = "io.appium.android.apis";
    protected static final int PORT = 4723;
    protected static AppiumDriver driver;
    private static AppiumDriverLocalService service;

    /**
     * initialization.
     */
    @BeforeClass
    public static void Android_setUp() throws MalformedURLException {
        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File(System.getenv("APPIUM_PATH")))
                .withIPAddress("127.0.0.1")
                .usingAnyFreePort()
//                .usingPort(PORT)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .build();
        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability("appPackage", "com.lenddo.mobile.paylater.staging");
//        capabilities.setCapability("appActivity", "com.lenddo.mobile.paylater.SplashScreenActivity");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/resources/apps/android/paylater-full-universal-debug.apk");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        capabilities.setCapability("eventTimings", true);
//        capabilities.setCapability("unicodeKeyboard", true);
//        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("autoGrantPermissions", true);
        driver = new AppiumDriver(service.getUrl(), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver, new AppiumListners());
    }

    public static void iOS_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = null;
        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File(System.getenv("APPIUM_PATH")))
                .withIPAddress("127.0.0.1")
//                .usingAnyFreePort()
                .usingPort(PORT)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub/")
                .build();
        service.start();

        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.2");
        capabilities.setCapability("appPackage", "com.lenddo.mobile.paylater.staging");
        capabilities.setCapability("appActivity", "com.lenddo.mobile.paylater.SplashScreenActivity");
        //capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/resources/apps/iOS/carbon_ng-v6.7.1_signed.apk");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        capabilities.setCapability("eventTimings", true);
//        capabilities.setCapability("unicodeKeyboard", true);
//        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("showIOSLog", true);
        driver = new IOSDriver(service.getUrl(), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver, new AppiumListners());
    }

    /**
     * finishing.
     */
    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".jpeg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

