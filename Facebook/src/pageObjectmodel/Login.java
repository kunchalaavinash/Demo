package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By username=By.id("identifierId");
	
	By nextbutton=By.xpath("//*[@id=\"identifierNext\"]/content/span");
	
	By password=By.cssSelector(".whsOnd.zHQkBf");
	
	By loginbutton=By.cssSelector(".RveJvd.snByac");
	
	
public Login(WebDriver driver) {
	
	this.driver=driver;
	
}
	
public void Typeusername(String uid)
{
	
	driver.findElement(username).sendKeys(uid);
	
}

public void Clicknextbutton() {
	
	driver.findElement(nextbutton).click();
	
}
public void Typepassword(String pass)
{
	
	driver.findElement(password).sendKeys(pass);
	
}
public void Clickloginbutton()
{
	
	driver.findElement(loginbutton).click();
	
}
}
