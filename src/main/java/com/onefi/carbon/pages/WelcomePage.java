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

public class WelcomePage {
    private AppiumDriver driver;
//    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging.introslides:id/tv_sign_in")
    @iOSXCUITFindBy(id = "com.lenddo.mobile.paylater.staging.introslides:id/tv_sign_in")
    private WebElement signIn;

    public WelcomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(60)), this);
    }

    public LogInPage clickSignInButton() {
//        wait.until(ExpectedConditions.visibilityOf(signIn));
        signIn.click();
        return new LogInPage(driver);
    }
}
