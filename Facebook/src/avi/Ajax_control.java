package avi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ajax_control {

	@Test
	public void google() {

		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");

		driver = new FirefoxDriver();

		// driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com");

		driver.findElement(By.id("lst-ib")).sendKeys("testing");

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			String str = list.get(i).getText();

			System.out.println(str);

			if (str.contains("testing tools")) {

				list.get(i).click();

				break;
			}
      }
	}

}
