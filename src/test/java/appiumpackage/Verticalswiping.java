package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Verticalswiping {
	@Test
	public void swipe() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName", "Redmi Note 10");
	dc.setCapability("automationName","uiautomator2");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion","12");
	dc.setCapability("UDID","b5f5db71");
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity",".ApiDemos");
//	dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\LENOVO\\Downloads\\ApiDemos-debug.apk");
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 30, "top", 250, "width", 980, "height", 1700,
			//	"elementId", ((RemoteWebElement) img).getId(),
			    "direction", "up",
			    "percent", 0.75
			));
	driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "left", 120, "top", 250, "width", 980, "height", 2700,
		//	"elementId", ((RemoteWebElement) img).getId(),
		    "direction", "down",
		    "percent", 0.75
		));
	
}
}
