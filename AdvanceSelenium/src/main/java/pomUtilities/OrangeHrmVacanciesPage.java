package pomUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmVacanciesPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//label[text()='Vacancy Name']/following::input[1]")
    WebElement vacancyName;

    @FindBy(xpath = "//label[text()='Job Title']/following::div[contains(@class,'oxd-select-text')][1]")
    WebElement jobTitle;

    @FindBy(xpath = "//label[text()='Description']/following::textarea[1]")
    WebElement description;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement hireManager;

    @FindBy(xpath = "//label[text()='Number of Positions']/following::input[1]")
    WebElement noOfPositions;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement save;

    public OrangeHrmVacanciesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void getVacancy(String vacancy) {
        wait.until(ExpectedConditions.visibilityOf(vacancyName));
        vacancyName.sendKeys(vacancy);
    }

    public void getJobTitleClick() {
        wait.until(ExpectedConditions.elementToBeClickable(jobTitle));
        jobTitle.click();
    }

    public void getJobTitleSelect() {
        WebElement option = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@role='option']//span")
                )
        );
        option.click();
    }

    public void getDescription(String vacancyDescription) {
        wait.until(ExpectedConditions.visibilityOf(description));
        description.sendKeys(vacancyDescription);
    }

    public void getHireMang(String hireManagerName) {
    	hireManager.sendKeys(hireManagerName);
    }

    public void getNoOfPos(String noOfPosition) {
        //wait.until(ExpectedConditions.visibilityOf(noOfPositions));
        noOfPositions.sendKeys(noOfPosition);
    }

    public void getSave() {
        wait.until(ExpectedConditions.elementToBeClickable(save));
        save.click();
    }
}