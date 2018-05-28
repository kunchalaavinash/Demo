package testcase_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectmodel.Loginpage;

public class Verifylogin {
	
	
	
	@Test
	
	public void verifylogin_gmail() throws Exception {
		
       System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		Loginpage a1=PageFactory.initElements(driver, Loginpage.class);
		
		a1.gmail("kunchala.avinash94", "Avinash@12");
		
	}

}
