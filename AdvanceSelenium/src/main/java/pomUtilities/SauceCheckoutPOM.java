package pomUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutPOM {
    WebDriver driver;
    public SauceCheckoutPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement continueButton;
    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    private WebElement checkoutOverview;
    @FindBy(id = "finish")
    private WebElement finishButton;
    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    private WebElement msg;

    public void enterFirstName(String value) {
        firstName.sendKeys(value);
    }
    public void enterLastName(String value){
        lastName.sendKeys(value);
  }
    public void enterPostalCode(String value){
        postalCode.sendKeys(value);
    }
    public void clickContinue(){
        continueButton.click();
    }
    public void verifyCheckoutOverview() {
        if(checkoutOverview.isDisplayed()) {
        	System.out.println("verifyCheckoutOverview----verifed");
        };
    }
    public void clickFinish(){
        finishButton.click();
    }
    public String getThankYouMessage(){
        return msg.getText();
    }
    
    public String getExcelData(int rowNum, int cellNum) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\SauceDemo.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");
        DataFormatter formatter = new DataFormatter();
        String data = formatter.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
        wb.close();
        fis.close();    
        return data;}
}