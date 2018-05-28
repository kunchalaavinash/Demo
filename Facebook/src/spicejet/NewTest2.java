package spicejet;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	
	 public WebDriver driver;
	 
	
  @Test
  public void f() {
	  
	  
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        //hyderabad is selected
        
        driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
        
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        
        //delhi is selected
        
        driver.findElement(By.xpath("html/body/form/div[6]/div[2]/div/div[5]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[11]/a")).click();
       
        //22-12-2017 date is selected
        
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
        
        Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        
        List<WebElement> a1=s1.getOptions();
        
        System.out.println(a1.size());
        
        for(WebElement ele:a1) {
        	
        	System.out.println(ele.getText()
        			);
        }
        
        s1.selectByValue("9");
        
        Select s2=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']")));
        
        s2.selectByIndex(3);
        
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
        
        String alert=driver.switchTo().alert().getText();
        
        System.out.print(alert);
        
        driver.switchTo().alert().accept();
        
        driver.close();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://spicejet.com/");
		
		String page_title=driver.getTitle();
		
		System.out.println("the title of the page is  "+page_title);
		
  }

}
