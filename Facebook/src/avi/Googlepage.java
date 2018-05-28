package avi;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlepage {

	public static void main(String[] args) {
		
		WebDriver  driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println("TestCase run succesfully");
		
		driver.navigate().to("https://www.google.com");
		
		System.out.println("google page is executed");
		
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.CONTROL,"t").build().perform();
		
	}

}
