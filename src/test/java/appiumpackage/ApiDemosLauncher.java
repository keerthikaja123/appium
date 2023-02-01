package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import appiumgestures.AppiumGesture;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosLauncher {
	@Test
	public void launchapp() throws MalformedURLException
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
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
	WebElement dot1=	driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	
	//(driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	 //   "elementId", ((RemoteWebElement) element).getId(),
	 //   "duration", 2000,
	  //  "x",193,
	  //  "y",623
	WebElement dot2=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
	AppiumGesture apg=new AppiumGesture();
	apg.drag(driver, dot1, 600, 620);
	
	
	
	
		
	}
	
	
	
	
	
	
	

}
