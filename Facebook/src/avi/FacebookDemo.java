package avi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		Select Sel1=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		
		Sel1.selectByIndex(8);
		
		Select Sel2=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		
		Sel2.selectByIndex(7);
		
		Select Sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		 
		Sel3.selectByVisibleText("2002");
		
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		
		driver.navigate().back();
	
	}

}
