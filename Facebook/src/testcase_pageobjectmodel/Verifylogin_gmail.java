package testcase_pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectmodel.Login;

public class Verifylogin_gmail {
	

	
	@Test
	public void verify_login() throws Exception {
		
      System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		Login a1=new Login(driver);
		
		a1.Typeusername("kunchala.avinash94@gmail.com");
		
		a1.Clicknextbutton();
		
		Thread.sleep(3000);
		
		a1.Typepassword("Avinash@12");
		
		a1.Clickloginbutton();
		
		driver.manage().window().maximize();
	}
	
	}
