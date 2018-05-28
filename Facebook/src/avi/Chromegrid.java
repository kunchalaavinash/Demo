package avi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chromegrid {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.VISTA);
		
		ChromeOptions options=new ChromeOptions();
		
		options.merge(cap);
		
		String url="http://192.168.0.25:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(url),options);
		
		driver.get("https://www.facebook.com");
		
		System.out.println("the browser is launched");

	}

}
