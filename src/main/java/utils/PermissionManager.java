package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PermissionManager {
    private AppiumDriver driver;

    public PermissionManager(AppiumDriver driver) {
        this.driver = driver;
    }

    public void allowPermission() {
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
    }

    public void denyPermission() {
        driver.findElement(By.id("com.android.packageinstaller:id/permission_deny_button")).click();
//        driver.findElement(By.xpath("//android.widget.Button[@text='DENY']")).click();
    }

    public void debitCardDeny() {
        driver.findElement(By.id("com.lenddo.mobile.paylater.staging.carboncards:id/btnNotRightNow")).click();
    }
}
