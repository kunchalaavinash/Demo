package avi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_class {

	@Test
	public void mouse() {	
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]"))).build().perform();	
		
		driver.close();
		}
}
