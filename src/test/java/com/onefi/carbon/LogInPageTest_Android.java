package com.onefi.carbon;

import com.onefi.carbon.pages.HomePage;
import com.onefi.carbon.pages.LogInPage;
import com.onefi.carbon.pages.WelcomePage;
import io.appium.java_client.functions.ExpectedCondition;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.JsonReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import static org.testng.Assert.assertEquals;


public class LogInPageTest_Android extends BaseTest {

//    LogInPage logInPage;
//    HomePage homePage;
//    WelcomePage welcomePage;

//    @DataProvider(name = "Login Credentials")
//    public Object[][] passData() throws IOException, ParseException {
//        return JsonReader.getJSONdata(System.getProperty("user.dir") + "/resources/TestData/TestData.json",
//                "Login Credentials", 2);
//    }

    @Test
    public void signIn() throws MalformedURLException {
        Android_setUp();
        LogInPage logInPage = new LogInPage(driver);
        HomePage homePage = new HomePage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        welcomePage.clickSignInButton();

        logInPage.setPhoneNumber("07066721842");
        logInPage.setPin("8378");
//        HomePage homePage = logInPage.clickSignInButton();
        logInPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        String text = String.valueOf(homePage.getAlertText());
        if (text.contentEquals((CharSequence) homePage.getAlertText())) {
            homePage.getAlertText();
        } else if (text.contentEquals((CharSequence) homePage.clickOkay())) {
            homePage.clickOkay();
        }

//        assertEquals(homePage.getAlertText(), "You logged into a secure area! x", "Alert text is incorrect");
//        tearDown();
    }
}