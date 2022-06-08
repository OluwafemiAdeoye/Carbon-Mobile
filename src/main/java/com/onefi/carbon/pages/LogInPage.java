package com.onefi.carbon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {
    private AppiumDriver driver;
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging:id/et_phone_number")
    @iOSXCUITFindBy(id = "com.lenddo.mobile.paylater.staging:id/et_phone_number")
    private WebElement phoneNumberField;

    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging.signin:id/et_pin")
    @iOSXCUITFindBy(id = "com.lenddo.mobile.paylater.staging.signin:id/et_pin")
    private WebElement pinField;

    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging:id/text_carbon_button")
    @iOSXCUITFindBy(id = "com.lenddo.mobile.paylater.staging:id/text_carbon_button")
    private WebElement signInButton;

    public LogInPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    public WebElement setPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOf(phoneNumberField));
        phoneNumberField.clear();
        phoneNumberField.sendKeys(phoneNumber);
        return phoneNumberField;
    }

    public WebElement setPin(String pin) {
        wait.until(ExpectedConditions.visibilityOf(pinField));
        pinField.clear();
        pinField.sendKeys(pin);
        return pinField;
    }

    public HomePage clickSignInButton() {
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();
        return new HomePage(driver);
    }
}
