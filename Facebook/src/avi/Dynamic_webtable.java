package avi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dynamic_webtable {
	
@Test
	public void freecrm() throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).clear();

		driver.findElement(By.name("username")).sendKeys("naveenk");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.name("password")).sendKeys("test@123");

		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn.btn-small")).click();

		String page_title = driver.getTitle();

		System.out.println("the title of the page is  " + page_title);

		driver.switchTo().frame("mainpanel");

		// Actions action=new Actions(driver);

		driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a")).click();

		System.out.println("the contacts page is performed");
		
		//method1

		// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]/td[2]/a

//		String beforepath = "html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[";
//
//		String afterpath = "]/td[2]/a";
//
//		for (int i = 4; i <= 9; i++) {
//
//			String contact = driver.findElement(By.xpath(beforepath + i + afterpath)).getText();
//
//			System.out.println(contact);
//
//			if (contact.contains("A555 A666")) {
//
//				// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[7]/td[1]/input
//
//				driver.findElement(By.xpath(beforepath + i + "]/td[1]/input")).click();
//
//				System.out.println("the contact is clicked");
//			}
//		}
		//method-2
		
		driver.findElement(By.xpath("//a[contains(text(),'AAA Virgo')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
		System.out.println("the contact page is clicked");
		
		//actions class is used
		
		Actions action =new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[8]/a"))).build().perform();
		
		driver.findElement(By.xpath("//a[@title='Call Scripts']")).click();
		
		System.out.println("the call page is opened");
		
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[8]/a"))).build().perform();
		
		driver.findElement(By.xpath("//a[@title='New Call']")).click();
		
	
	}

}
