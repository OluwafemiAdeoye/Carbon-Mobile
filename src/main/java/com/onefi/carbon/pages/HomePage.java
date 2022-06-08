package com.onefi.carbon.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage {
    private AppiumDriver driver;

    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging:id/btnNotRightNow")
    private WebElement getCarbonCard;
    @AndroidFindBy(id = "com.lenddo.mobile.paylater.staging.home:id/btn_okay")
    private WebElement clickOkayButton;

    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(60)), this);
    }

    public String getAlertText() {
        return driver.findElement((By) getCarbonCard).getText();
    }

    public WebElement clickOkay() {
        clickOkayButton.click();
        return null;
    }
}
