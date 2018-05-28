package excel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excel {
	
	WebDriver driver;
	
@BeforeTest

public void setup() {
	
	System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.ebay.com");
}

@Test

public void test() {
	
	driver.findElement(By.cssSelector("#gh-ug-flex>a")).click();
	
	String a1=driver.getTitle();
	
	System.out.println(a1);
}
}
