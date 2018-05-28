package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2 {

	WebDriver driver;
	
	By username=By.id("identifierId");
	
	By nextbutton=By.xpath("//*[@id=\"identifierNext\"]/content/span");
	
	By password=By.cssSelector(".whsOnd.zHQkBf");
	
	By loginbutton=By.cssSelector(".RveJvd.snByac");
	
	
public Login2(WebDriver driver) {
	
	this.driver=driver;
	
}
	
public void verify_login(String uid, String pass) throws Exception {
	
	driver.findElement(username).sendKeys(uid);
	
	driver.findElement(nextbutton).click();
	
	Thread.sleep(2000);
	
	driver.findElement(password).sendKeys(pass);
	
	driver.findElement(loginbutton).click();
}
}
