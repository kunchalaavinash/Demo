package practise;

import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouse_Movement {
	
	private static final int File = 0;
	WebDriver driver;
	private int OutputType;
	
	 @BeforeTest
	  public void beforeTest() {
		  
		  
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
		    driver.manage().deleteAllCookies();
			
			driver.get("https://amazon.in");

}
	 
  @Test
  public void mouse() {
	  
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]"))).build().perform();
	  
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  
	  //System.out.println(driver.getTitle());
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[1]/span"))).build().perform();
	  
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[1]/div[1]/div/a[1]/span[1]"))).click()
	  .build().perform();
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mens shoes");
	   
	  driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).sendKeys(Keys.ENTER);
	  
	     //JavascriptExecutor js=(JavascriptExecutor)driver;
	  
		 //js.executeScript("window.ScrollBy(0,800)"," ");
	  
	  //  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.File);
	 
	  System.out.println(driver.getTitle());  
	  
	 
  }
}