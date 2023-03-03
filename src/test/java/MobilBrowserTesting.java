import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

public class MobilBrowserTesting {

    @Test

    public void Mobil() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "PIXEL");
       caps.setCapability("browserName","chrome");
      caps.setCapability("chromedriverExecutable", "C:\\Users\\nilufer\\IdeaProjects\\MobilBrowserTesting\\src\\driver\\chromedriver.exe");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);



        driver.get("https://www.amazon.com.tr");




    }

}