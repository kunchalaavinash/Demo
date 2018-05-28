package practise;

import org.testng.annotations.Test;

import testng_liestners.Failed_testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(testng_liestners.Itestng_Liestners.class)

public class NewTest {
	
	public WebDriver driver;
	
  @Test(retryAnalyzer=Failed_testcases.class)
  public void f() {
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mens sport shoes");
	  
	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	  
	  String parent=driver.getWindowHandle();
	  
	  System.out.println(parent);
	  
	  List<WebElement> links=driver.findElements(By.tagName("div"));
	  
	  int a=links.size();
	  
	  System.out.println("the number of links are"+a);
	  
	  driver.close();
	  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe" );
	  
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in");
	  
	  
  }

}
