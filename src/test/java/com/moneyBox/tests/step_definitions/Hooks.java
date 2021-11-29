package com.moneyBox.tests.step_definitions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

//Here every time i click "Run" IDE will execute this "@Before" method before anything else and check our DesiredCapabilities,
//and get us to ConfirmAllocation page
public class Hooks {

    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_22");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");


        desiredCapabilities.setCapability("appPackage", "com.android.moneyBoxApp");

        desiredCapabilities.setCapability("appActivity", "com.android.moneyBoxApp.moneyBoxApp");


        AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://moneyBox/ConfirmAllocation.SauceLab.co.uk"), desiredCapabilities);
    }
}
