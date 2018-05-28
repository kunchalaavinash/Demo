package windowhandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriwindowsHandle {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.naukri.com");
		
	String parent_window=driver.getWindowHandle();
	
	System.out.println("the parent window id is  "+parent_window);
	
	Set<String> all_Windows=driver.getWindowHandles(); 
	
	int count=all_Windows.size();
	
	System.out.println("the count is "+count);
	
	for(String child:all_Windows) {
		
		if(!parent_window.equalsIgnoreCase(child)) {
			
			driver.switchTo().window(child);
			
			System.out.println(driver.getWindowHandle());
			
			System.out.println(driver.getCurrentUrl());
			
			driver.close();
			
			
		}
	}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("the parent title is "+driver.getTitle());
		
		driver.close();
	
	}

}
