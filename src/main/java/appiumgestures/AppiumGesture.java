package appiumgestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class AppiumGesture {
	public void clickonElement(AndroidDriver driver,WebElement element)
	{
		
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	public void clickonElementByCoordinates(AndroidDriver driver,int x,int y)
	{
		
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		   // "elementId", ((RemoteWebElement) element).getId()
				"x",x,
			    "y",y
				
		));
	}
	public void longClick(AndroidDriver driver,WebElement element)
	{
		
			(driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	public void longClickByCoordinates(AndroidDriver driver,int x,int y)
	{
		
		driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
			    //"elementId", ((RemoteWebElement) element).getId(),
			    "duration", 2000,
			    "x",x,
			    "y",y
		));
	}
	public void drag(AndroidDriver driver,WebElement element,int endx,int endy)
	{
		 driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", endx,
			    "endY", endy
			));
	}
	public void swipe(AndroidDriver driver,WebElement element)
	{
		// Java
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
		   // "left", 100, "top", 100, "width", 200, "height", 200,
				"elementId", ((RemoteWebElement) element).getId(),
		    "direction", "left",
		    "percent", 0.75
		));
	}

}


