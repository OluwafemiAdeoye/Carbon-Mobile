package com.onefi.carbon;

import com.onefi.carbon.pages.HomePage;
import com.onefi.carbon.pages.LogInPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;


public class LogInPageTest_iOS extends BaseTest {

    LogInPage logInPage;
    HomePage homePage;

    @Test
    public void signIn() throws MalformedURLException {
        iOS_setUp();
//        LogInPage logInPage = new LogInPage(driver);
//        WelcomeScreenTest welcomeScreenTest = new WelcomeScreenTest();
//        welcomeScreenTest.welcomeScreen();
        logInPage.setPhoneNumber("07066721842");
        logInPage.setPin("8378");
//        HomePage homePage = logInPage.clickSignInButton();
        logInPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        tearDown();
    }
}