package xmltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	
@Test
@Parameters("browser")

 public void verifybrowser(String browsername) {
	
	if(browsername.equalsIgnoreCase("Firefox")) 
			{
		
       System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
       
       driver=new FirefoxDriver();
       
	}else if(browsername.equalsIgnoreCase("chrome")) {
		
	   System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			
	   driver=new ChromeDriver();
	   
			
	}
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");

	driver.quit();
}      
	}
