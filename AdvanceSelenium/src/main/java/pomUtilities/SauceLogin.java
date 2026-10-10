package pomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogin {
WebDriver driver;
	
	public SauceLogin (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
    private WebElement usern;
	
	
	@FindBy(id="password")
	private WebElement pwtf;
	
	@FindBy(id = "login-button")
	private WebElement login;

	
	//Getter methods 
	
	
	public void  getusern(String value ) {
		usern.sendKeys(value);
	}

	public void getPwtf(String value ) {
		 pwtf.sendKeys(value);
	}

	public void  getLogin() {
		login.click();
	}
	
	
}
