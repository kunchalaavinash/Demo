package spicejet;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) 
		{
            WebElement ele=links.get(i);
            
            String url=ele.getAttribute("href");
            
            VerifylinksActive(url);
            
            }

	}
	
	public static void VerifylinksActive(String linkurl) throws Exception {
		
		try {
			URL url=new URL(linkurl);
			
			HttpURLConnection urlconnect=(HttpURLConnection)url.openConnection();
			
			urlconnect.setConnectTimeout(3000);
			
			urlconnect.connect();
			
			if(urlconnect.getResponseCode()==200) {
				
				System.out.println(linkurl);
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		}

}
