package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiumgestures.AppiumGesture;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Swipeactioninappium {
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
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
WebElement img1=	driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
AppiumGesture apg=new AppiumGesture();
apg.swipe(driver, img1);

}
}
