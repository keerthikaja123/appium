package appiumpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class PerfomSwipe { 
	
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
//		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\LENOVO\\Downloads\\ApiDemos-debug.apk");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		
	}

}














