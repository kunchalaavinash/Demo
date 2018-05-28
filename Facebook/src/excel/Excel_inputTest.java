package excel;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Excel_inputTest {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  FileInputStream f1=new FileInputStream("C:\\Users\\Bhargav Tej\\Desktop\\test.xls");
	  
	  Workbook w1=Workbook.getWorkbook(f1);
	  
	  Sheet s1=w1.getSheet("Sheet1");
	  
	  int a=s1.getRows();
	  
	  System.out.println(a);
	  
	  for(int i=1; i<a;i++) {
		  
		  driver.findElement(By.id("email")).clear();
		  
		  driver.findElement(By.id("email")).sendKeys(s1.getCell(0, i).getContents());
		  
		  driver.findElement(By.id("pass")).clear();
		  
		  driver.findElement(By.id("pass")).sendKeys(s1.getCell(1, i).getContents());
		  
		  driver.findElement(By.id("loginbutton")).click();
		  
		  if(driver.findElement(By.id("reg-link")).isDisplayed()) {
			  
			  System.out.println("the credentials are invalid");
		  }else {
			  
			  System.out.println("the credentials are valid");
		  }
		  
		  String url="https://www.facebook.com";
		  
		  driver.get(url);
		  
	  }
	  
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
  }

}
