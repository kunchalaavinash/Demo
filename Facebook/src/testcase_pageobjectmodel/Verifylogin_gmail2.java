package testcase_pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectmodel.Login2;

public class Verifylogin_gmail2 {
	

	
	@Test
	public void verify_login() throws Exception {
		
      System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		Login2 a1=new Login2(driver);
		
		a1.verify_login("kunchala.avinash94", "Avinash@12");
		
		driver.close();
		
		}
	
	}
