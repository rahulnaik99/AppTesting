import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {
    public AndroidDriver driver;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {

        // Start Appium server
        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\Rahul\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        //service.start();


        // Capabilities setup
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("motorola moto g73 5g"); // Check with adb devices
        options.setApp("C:\\Users\\Rahul\\IdeaProjects\\appium\\src\\test\\resources\\driver\\ApiDemos-debug.apk");
        options.setAutomationName("UIAutomator2");

        // Create the Android driver
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        // Add a simple interaction or wait
        System.out.println("App launched successfully!");



    }
    public void tearDown(){
        driver.quit();
//        service.stop();
    }
}
