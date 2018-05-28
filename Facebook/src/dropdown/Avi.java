package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Avi {
	
@Test
	
	public void verifyFacebook() {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		String title=driver.getTitle();
		
		//String original_title="Facebook – log in or sign up";
		
		Assert.assertTrue(title.contains("Facebook"));
		
		System.out.println("the title is verified");
		
		driver.close();
	}

}
