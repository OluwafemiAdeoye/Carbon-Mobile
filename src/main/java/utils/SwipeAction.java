//package utils;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import org.openqa.selenium.support.PageFactory;
//
//import java.time.Duration;
//
//
//public class SwipeAction {
//    private AppiumDriver driver;
//
//    public SwipeAction(AppiumDriver driver) {
//        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
//    }
//
//
//    public void swipeLeftToRight() {
////        Get the mobile screen size
//        Dimention windowSize = driver.manage().window().getSize();
//        int screenHeight = windowSize.getHeight();
//        int screenWidth = windowSize();
//
////        Init start points and end points to touch and release
//        int xStartPoint = 50 * screenWidth / 100;
//        int xEndPoint = 10 * screenWidth / 100;
//        int yStartPoint = 50 * screenWidth / 100;
//        int yEndPoint = yStartPoint;
//    }
//
//    public void swipeRightToLeft() {
//
//    }
//}
//
////This is used to call the scroll method anywhere in the future when needed.
