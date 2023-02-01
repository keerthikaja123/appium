package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeandDrag {
	AndroidDriver driver;
	@Test
	public void drag() throws MalformedURLException
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
		 driver=new AndroidDriver(url,dc);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		WebElement dot1=driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']"));
		WebElement dot2=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
	 driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			 "elementId", ((RemoteWebElement) dot1).getId(),
			    "endX", 600,
			    "endY", 620
			));
	}
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
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 driver=new AndroidDriver(url,dc);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement img=driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
		// Java
	driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
		   // "left", 100, "top", 100, "width", 200, "height", 200,
			"elementId", ((RemoteWebElement) img).getId(),
		    "direction", "left",
		    "percent", 0.75
		));
		
		
	}

}
