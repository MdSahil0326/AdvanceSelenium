package pomUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[contains(@class,'oxd-userdropdown-tab')]")
    private WebElement userDropdown;


    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logout;


    public void clickUserDropdown() {

        wait.until(ExpectedConditions.elementToBeClickable(userDropdown));

        userDropdown.click();
    }


    public void clickLogout() {

        wait.until(ExpectedConditions.elementToBeClickable(logout));

        logout.click();

        System.out.println("Logged out successfully");
    }
}