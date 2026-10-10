package pomUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCandidatePage {

    WebDriver driver;
    WebDriverWait wait;

    public AddCandidatePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        PageFactory.initElements(driver, this);
    }


    // First Name
    @FindBy(name = "firstName")
    private WebElement firstname;


    // Middle Name
    @FindBy(name = "middleName")
    private WebElement middlename;


    // Last Name
    @FindBy(name = "lastName")
    private WebElement lastname;


    // Vacancy
    @FindBy(css = "[class='oxd-select-text-input']")
    private WebElement vacancy;


    // Email
    @FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
    private WebElement email;


    // Mobile
    @FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
    private WebElement mobile;


    // File
    @FindBy(xpath = "//input[@type='file']")
    private WebElement file;


    // Application Date
    @FindBy(xpath = "//label[text()='Date of Application']/../following-sibling::div//input")
    private WebElement applicationDate;


    // Save
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement save;


    // ---------------- METHODS ----------------


    public void enterFirstName(String value) {

        wait.until(ExpectedConditions.visibilityOf(firstname));

        firstname.sendKeys(value);
    }


    public void enterMiddleName(String value) {

        middlename.sendKeys(value);
    }


    public void enterLastName(String value) {

        lastname.sendKeys(value);
    }


    // Vacancy
    public void selectVacancy() throws AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(vacancy));

        vacancy.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void enterEmail(String value) {

        email.sendKeys(value);
    }


    public void enterMobile(String value) {

        mobile.sendKeys(value);
    }


    public void uploadFile(String value) {

        file.sendKeys(value);
    }


    public void enterApplicationDate(String value) throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(applicationDate));

        applicationDate.click();

        applicationDate.sendKeys(Keys.CONTROL + "a");

        applicationDate.sendKeys(value);
        Thread.sleep(2000);
        applicationDate.sendKeys(Keys.ENTER);
    }


    public void clickSave() {

        try {

            WebElement saveButton =
                    driver.findElement(By.xpath("//button[@type='submit']"));

            saveButton.click();

            System.out.println("Save button clicked");

        } catch (StaleElementReferenceException e) {

            System.out.println(
                "Candidate saved - page changed after Save click"
            );
        }
    }
    }
