package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dopdown2type {

	public static void main(String[] args) {
		
         WebDriver driver;
         
         System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
         
         driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         driver.get("https://facebook.com");
         
         Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
         
         List<WebElement>Total_month=sel1.getOptions();

         System.out.println(Total_month.size());
         
         for(WebElement ele:Total_month) {
        	 
        	 System.out.println("Months are   "+ele.getText());
         }
         
         driver.close();
	}

}
