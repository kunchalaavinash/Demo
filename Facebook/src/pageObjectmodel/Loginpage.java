package pageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(id="identifierId") WebElement username;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"identifierNext\"]/content/span") WebElement nextbutton;
	
	@FindBy(how=How.CSS, using=".whsOnd.zHQkBf") WebElement password;
	
	@FindBy(how=How.CSS, using=".RveJvd.snByac") WebElement loginbutton;
	
	
public void gmail(String uid, String pass) throws Exception {
	
	username.sendKeys(uid);
	
	nextbutton.click();
	
	Thread.sleep(2000);
	
	password.sendKeys(pass);
	
	loginbutton.click();
}
	}
