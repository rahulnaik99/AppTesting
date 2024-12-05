import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class appiumbasics extends baseTest {
    @Test
    public void appiumTest() throws Exception {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }
}
