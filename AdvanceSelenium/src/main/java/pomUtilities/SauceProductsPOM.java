package pomUtilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductsPOM {
    WebDriver driver;
    public SauceProductsPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Products']")
    private WebElement productsTitle;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpack;
    @FindBy(className = "shopping_cart_badge")
    private WebElement cartCount;
    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;
    
    public void verifyProductsPage() {
        productsTitle.isDisplayed();
        System.out.println("Productpage-verified");
    }
    public void addBackpackToCart() {
        backpack.click();
    }
    public void getCartCount() {
        System.out.println("Number of Products in cart : "+cartCount.getText());
    }
    public void clickCart() {
        cartIcon.click();
    }
}