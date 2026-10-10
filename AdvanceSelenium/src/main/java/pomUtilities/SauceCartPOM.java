package pomUtilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartPOM {
    WebDriver driver;
    public SauceCartPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement backpack;
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    
    public void verifyBackpack() {
        backpack.isDisplayed();
        System.out.println("Backpack------Verified");
  }
    public void clickCheckout() {
        checkoutButton.click();
        System.out.println("Checkout button clicked");
   }
}