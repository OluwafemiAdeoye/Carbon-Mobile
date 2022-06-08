package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;


public class ScrollManager {
    private AppiumDriver driver;

    public void scrollToText(String text) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))")).click();

    }

    public void scrollToProduct(String product) {
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + product + "\"))");
    }

    public void swipeLeftToRight() {

    }

    public void swipeRightToLeft() {

    }
}

//This is used to call the scroll method anywhere in the future when needed.
