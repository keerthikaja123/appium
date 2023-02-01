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

public class Completepagescrolling {
	@Test
	public void scroll() throws MalformedURLException
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
//WebElement element=driver.findElement(AppiumBy.id("android:id/content"));

/*driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		
		"elementId", ((RemoteWebElement) element).getId(),
 //"left", 100, "top", 100, "width", 200, "height", 200,
 "direction", "down",
 "percent", 1.0
));
driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
		
	//	"elementId", ((RemoteWebElement) element).getId(),
 "left", 250, "top", 700, "width", 700, "height", 1300,
 "direction", "down",
 "percent", 1.0
));*/
	WebElement element1=	driver.findElement(AppiumBy.id("android:id/content"));
Boolean canScrollMore = true;
while(canScrollMore)
{
canScrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(

	"elementId", ((RemoteWebElement) element1).getId(),
// "left", 250, "top", 700, "width", 700, "height", 1300,
 "direction", "down",
 "percent", 1.0
));
element1=	driver.findElement(AppiumBy.xpath("//android.widget.ListView/android.widget.TextView[@index=1]"));


}
}
}
