package pomUtilities;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class pomDay8 {
	//create a obj
	WebDriver driver;
	
	
	//constructor with page factory 
	public pomDay8(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//find elements 
	@FindBy(css = "[name='username']")
	private WebElement untf;
	
	@FindBy(css = "[name='password']")
	private WebElement pwtf;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	 
	
	
	
	
	
    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement add;
    
   
    
    
    
    
    
    //Enter the first name and mname ,lastname 
    @FindBy(name = "firstName")
    private WebElement firstname;

    @FindBy(name = "middleName")
    private WebElement middlename;

    @FindBy(name = "lastName")
    private WebElement lastname;

    @FindBy(css = "[class='oxd-select-text-input']")
    private WebElement vacancy;

    @FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
    private WebElement email;

    @FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
    private WebElement mobile;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement file;

    @FindBy(xpath = "//label[text()='Date of Application']/../following-sibling::div//input")
    private WebElement applicationDate;

    
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement save;

    
    
    
    
    
    

    // Candidates
    @FindBy(xpath = "//a[text()='Candidates']")
    private WebElement candidates;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement jobTitle;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
    private WebElement candidateVacancy;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
    private WebElement hiringManager;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[4]")
    private WebElement status;

    @FindBy(css = "[placeholder='Type for hints...']")
    private WebElement candidateName;

    @FindBy(css = "[placeholder='From']")
    private WebElement fromDate;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement search;


    
    
    
    // Logout
    @FindBy(xpath = "//span[contains(@class,'oxd-userdropdown-tab')]")
    private WebElement userDropdown;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logout;


    
    
    
    
    
    
    
    // Methods
    public void getUsername(String value) {
        untf.sendKeys(value);
    }

    public void getPassword(String value) {
        pwtf.sendKeys(value);
    }

    public void getLogin() {
        login.click();
    }
    
    
    
    

    public void getRecruitment() {
        recruitment.click();
    }

    public void getAdd() {
        add.click();
    }


 
    
    
    
    
    public void getFirstname(String value) {
        firstname.sendKeys(value);
    }

    public void getMiddlename(String value) {
        middlename.sendKeys(value);
    }

    public void getLastname(String value) {
        lastname.sendKeys(value);
    }


    // Vacancy dropdown using Robot

    public void getVacancy() throws AWTException {

        vacancy.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void getEmail(String value) {
        email.sendKeys(value);
    }

    public void getMobile(String value) {
        mobile.sendKeys(value);
    }

    public void getFile(String value) {
        file.sendKeys(value);
    }

    public void getApplicationDate(String value) throws InterruptedException {
        applicationDate.click();
        applicationDate.sendKeys(Keys.CONTROL,"a");
        applicationDate.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        applicationDate.sendKeys(value);
        Thread.sleep(1000);
        applicationDate.sendKeys(Keys.ENTER);
    }

    public void getSave() throws InterruptedException {
    	Thread.sleep(3000);
        save.click();
    }

    
    
    
    
    
    
    

    // Candidates

    public void getCandidates() throws InterruptedException {
        candidates.click();
    }

    // Job Title dropdown

    public void getJobTitle() throws AWTException {

        jobTitle.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Vacancy dropdown

    public void getCandidateVacancy() throws AWTException {

        candidateVacancy.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Hiring Manager dropdown

    public void getHiringManager() throws AWTException {

        hiringManager.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    // Status dropdown

    public void getStatus() throws AWTException {

        status.click();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


    public void getCandidateName(String value) {
        candidateName.sendKeys(value);
    }

    public void getFromDate(String value) throws InterruptedException {
        fromDate.click();
        Thread.sleep(2000);
        fromDate.clear();
        fromDate.sendKeys(value);
    }

    public void getSearch() throws InterruptedException {
    	Thread.sleep(2000);
        search.click();
    }


    // Logout

    public void getUserDropdown() {
        userDropdown.click();
    }

    public void getLogout() {
        logout.click();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

