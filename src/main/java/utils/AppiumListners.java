package utils;

import com.aventstack.extentreports.model.*;
import com.aventstack.extentreports.reporter.TestListener;
import io.appium.java_client.events.api.general.AppiumWebDriverEventListener;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AppiumListners implements AppiumWebDriverEventListener, TestListener {

    @Override
    public void onTestStarted(Test test) {
    }

    @Override
    public void onTestRemoved(Test test) {

    }

    @Override
    public void onNodeStarted(Test test) {

    }

    @Override
    public void onLogCreated(Test test, Log log) {

    }

    @Override
    public void onCategoryAssigned(Test test, Category category) {

    }

    @Override
    public void onAuthorAssigned(Test test, Author author) {

    }

    @Override
    public void onDeviceAssigned(Test test, Device device) {

    }

    @Override
    public void onScreenCaptureCreated(Test test, ScreenCapture screenCapture) throws IOException {

    }

    @Override
    public void onScreenCaptureCreated(Log log, ScreenCapture screenCapture) throws IOException {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicking on " + element.getText());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
//        System.out.println(element.getText() + "clicked successful");
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}
