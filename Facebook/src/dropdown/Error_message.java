package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Error_message {

	public static void main(String[] args)throws InterruptedException 
	{
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		
		String actual_message=driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		
		String expected_message="Enter an email or phone number";
		
		//type1 to get value
		
		Assert.assertEquals(actual_message,expected_message);
		
		//type2 to get values
		
		Assert.assertTrue(actual_message.contains("Enter an email"));
		
		driver.close();
		
		System.out.println(actual_message);

	}

}
