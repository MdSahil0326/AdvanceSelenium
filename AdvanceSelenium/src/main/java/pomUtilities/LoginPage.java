package pomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name='username']")
    private WebElement username;

    @FindBy(css = "[name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;


    public void enterUsername(String value) throws InterruptedException {
    	Thread.sleep(2000);
        username.sendKeys(value);
    }

    public void enterPassword(String value) {
        password.sendKeys(value);
    }

    public void clickLogin() {
        loginButton.click();
    }
}	