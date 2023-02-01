package driverActions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DriverActions extends Baseclass {
	@Test
	public void driveractions() throws InterruptedException
	{
	WebElement element=	driver.findElement(AppiumBy.accessibilityId("Views"));
	element.click();
		//driver.terminateApp("io.appium.android.apis");
	//	System.out.println(driver.isAppInstalled("com.android.camera"));
		//driver.installApp("C:\\Users\\LENOVO\\Downloads\\ApiDemos-debug.apk");
		driver.runAppInBackground(Duration.ofSeconds(10));
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		driver.activateApp("com.android.camera");
		System.out.println(driver.queryAppState("io.appium.android.apis"));
		Thread.sleep(3000);
	System.out.println(	driver.queryAppState("com.android.camera"));
		
	}

}
