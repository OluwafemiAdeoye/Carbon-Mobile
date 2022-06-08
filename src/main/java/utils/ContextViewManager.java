package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ContextViewManager {
    AndroidDriver driver;

    public ContextViewManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public void contextViewCheck() {
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.context((String) contextNames.toArray()[1]); // set context to WEBVIEW_1

//do some web testing
//        String myText = driver.findElement(By.cssSelector(".green_button")).click();

        driver.context("NATIVE_APP");

// do more native testing if we want

        driver.quit();

    }
}
