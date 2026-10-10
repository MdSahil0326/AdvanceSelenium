package pomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DSWebpage {
//initilazition
	WebDriver driver;
	
	public DSWebpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//declare
  @FindBy(id="small-searchterms")
  private WebElement stf;
  
  @FindBy(css = "[class='button-1 search-box-button']")
  private WebElement sbutton;
  
  
  
  @FindBy(xpath = "//a[(text())='Register']")
  private WebElement register;
  
  @FindBy(id="FirstName")
  private WebElement fn;
  
  
  
  
  
  

  public void  getStf(String Value ) {
	stf.sendKeys(Value);
  }

  public void getSbutton() {
	sbutton.click();
  }

  public void getRegister() {
	register.click();
  }
  
  public void getfn(String value) {
	  fn.sendKeys(value);
  }
  

  
  
 
  
  
  
  
  
  
  
	
}
