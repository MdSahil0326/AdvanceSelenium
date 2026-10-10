package pomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QSdemo {
WebDriver driver;
	
	public QSdemo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement register;

	public void getName(String value ) {
 		name.sendKeys(value);
	}

	public void getEmail(String value) {
		email.sendKeys(value);
	}

	public void getPass(String value) {
		pass.sendKeys(value);;
	}

	public void getRegister() {
		register.click();
	}
	
	
	
	
	
	
	
	
	
	

}
