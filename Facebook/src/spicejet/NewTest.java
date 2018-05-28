package spicejet;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
	 public WebDriver driver;
	 
	
  @Test(description="This Testcase will check the SpiceJet searching funnctionality")
  public void f() throws Exception {
	  
	  
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        //hyderabad is selected
        
        driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        
        //delhi is selected
        
       List<WebElement> location=driver.findElements(By.xpath("//div[@class='dropdownDiv']"));
       
             int total_location=location.size();
            
             System.out.println("the total location are  "+total_location);
 
        for(int i=0;i<total_location;i++) {
        	
        	String location_value=location.get(i).getText();
        	
        	if(location_value.equalsIgnoreCase("Delhi(DEL)")) {
        		
        		location.get(i).click();
        		
        		break;
        	}
        	
        	
        }
        
        Thread.sleep(2000);
        
        //22-12-2017 date is selected
        
       // driver.findElement(By.xpath("html/body/div[1]/div[1]/table/tbody/tr[4]/td[6]/a")).click();
        
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date1']")).click();
        
       List<WebElement> date= driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody"));
       
       int total_node=date.size();
       
       System.out.println("the total dates available is "+total_node);
       
       for(int i=0;i<total_node;i++) {
    	   
    	   String dates=date.get(i).getText();
    	   if(dates.equalsIgnoreCase("11")) {
    		   
    		   date.get(i).click();
    		   
    		   break;
    	   }
    	   
       }
        
        Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        
        s1.selectByValue("9");
        
        Select s2=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']")));
        
        s2.selectByIndex(3);
        
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
        
        //String alert=driver.switchTo().alert().getText();
        
        //System.out.print(alert);
        
        //driver.switchTo().alert().accept();
        
        //driver.close();
	 
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
