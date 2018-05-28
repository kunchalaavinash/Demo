package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dopdown {

	public static void main(String[] args) {
		
         WebDriver driver;
         
         System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.19.1-win32\\geckodriver.exe");
         
         System.out.println(System.getProperty("os.name"));
         
         driver=new FirefoxDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://facebook.com");
         
         Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
         
         sel1.selectByIndex(4);
         
         WebElement Selected_month=sel1.getFirstSelectedOption();
         
         System.out.println("the selected month is  "+Selected_month.getText());
         
         driver.close();
	}

}
