import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "Nexus5");
        dc.setCapability("automationName", "Appium");
        dc.setCapability("appPackage", "org.wikipedia");
        dc.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        dc.setCapability("udid", "emulator-5554");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        System.out.println("First test run");
    }
}
