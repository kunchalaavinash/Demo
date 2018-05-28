package avi;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Facebook {
	
	WebDriver driver;
	ExtentTest logger;
    ExtentReports report;
    
	@BeforeMethod
	
	public void openbrowser() {
		
		report=new ExtentReports("F:\\Selenium workspace\\avinash\\Facebook\\test-output.html");
		
		logger=report.startTest("Facebook");
		
        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		driver=new FirefoxDriver();
         
         System.out.println(System.getProperty("os.name"));
         
         logger.log(LogStatus.INFO, "browser is started");
         
         driver.manage().window().maximize();
         
         driver.get("https://facebook.com");
	}
	
	@Test
	
	public void dropdown() {
		
         Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
         
         sel1.selectByIndex(4);
         
         WebElement Selected_month=sel1.getFirstSelectedOption();
         
         System.out.println("the selected month is  "+Selected_month.getText());
         
	}
	
	@AfterMethod
	
	public void teardown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			logger.log(LogStatus.FAIL, "the test case is failed");
			
//	   TakesScreenshot 	ts	=(TakesScreenshot)driver;
//	   
//	   File source=ts.getScreenshotAs(OutputType.FILE);
	   
	   report.endTest(logger);
	   
	   report.flush();
	   
	   driver.get("F:\\Selenium workspace\\avinash\\Facebook\\test-output.html");
	   
	   }
		
	}

	

}
