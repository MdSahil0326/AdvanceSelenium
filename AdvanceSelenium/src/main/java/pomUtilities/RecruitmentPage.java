package pomUtilities;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecruitmentPage {

    WebDriver driver;
    WebDriverWait wait;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement recruitment;


    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement add;


    public void clickRecruitment() {

        wait.until(ExpectedConditions.elementToBeClickable(recruitment));

        recruitment.click();

        System.out.println("Recruitment clicked");
    }


    public void clickAdd() {

        wait.until(ExpectedConditions.elementToBeClickable(add));

        add.click();

        System.out.println("Add button clicked");
    }
}