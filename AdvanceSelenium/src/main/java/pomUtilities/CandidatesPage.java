package pomUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatesPage {

    WebDriver driver;
    WebDriverWait wait;

    public CandidatesPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        PageFactory.initElements(driver, this);
    }


    // Candidates tab
    @FindBy(xpath = "//a[normalize-space()='Candidates']")
    private WebElement candidates;


    // Job Title
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement jobTitle;


    // Vacancy
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    private WebElement candidateVacancy;


    // Hiring Manager
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
    private WebElement hiringManager;


    // Status
    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
    private WebElement status;


    // Candidate Name
    @FindBy(css = "[placeholder='Type for hints...']")
    private WebElement candidateName;


    // From Date
    @FindBy(css = "[placeholder='From']")
    private WebElement fromDate;


    // Search
    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement search;


    // Candidate record
    @FindBy(xpath = "//div[contains(@class,'oxd-table-body')]")
    private WebElement records;


    // ---------------- METHODS ----------------


    public void clickCandidates() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement candidatesButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[normalize-space()='Candidates']")
                )
        );

        candidatesButton.click();

        System.out.println("Candidates clicked");
    }


    // Job Title
    public void selectJobTitle() throws AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(jobTitle));

        jobTitle.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Vacancy
    public void selectVacancy() throws AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(candidateVacancy));

        candidateVacancy.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Hiring Manager
    public void selectHiringManager() throws AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(hiringManager));

        hiringManager.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Status
    public void selectStatus() throws AWTException {

        wait.until(ExpectedConditions.elementToBeClickable(status));

        status.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Candidate Name
    public void enterCandidateName(String value) {

        wait.until(ExpectedConditions.visibilityOf(candidateName));

        candidateName.sendKeys(value);
    }


    // From Date
    public void enterFromDate(String value) {

        wait.until(ExpectedConditions.elementToBeClickable(fromDate));

        fromDate.click();

        fromDate.clear();

        fromDate.sendKeys(value);
    }


    // Search
    public void clickSearch() {

        wait.until(ExpectedConditions.elementToBeClickable(search));

        search.click();

        System.out.println("Search clicked");
    }


    // Verify candidate
    public void verifyCandidate(String candidateName) {

        WebElement candidate = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(
                            "//div[contains(@class,'oxd-table-body')]"
                            + "//div[contains(normalize-space(),'"
                            + candidateName +
                            "')]"
                        )
                )
        );

        if (candidate.isDisplayed()) {

            System.out.println(
                    "PASS: Candidate " + candidateName + " is present in records."
            );

        } else {

            System.out.println(
                    "FAIL: Candidate " + candidateName + " is not present."
            );
        }
    }
}