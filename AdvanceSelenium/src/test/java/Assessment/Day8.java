package Assessment;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomUtilities.AddCandidatePage;
import pomUtilities.CandidatesPage;
import pomUtilities.HomePage;
import pomUtilities.LoginPage;
import pomUtilities.RecruitmentPage;

public class Day8 {

    public static void main(String[] args)
            throws AWTException, InterruptedException, IOException {


        // Read properties file

        FileInputStream file =
                new FileInputStream(
                        "./src/test/resources/DDT/Day8.properties"
                );

        Properties p = new Properties();

        p.load(file);


        // Browser

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        driver.get(p.getProperty("url"));


        // =========================
        // LOGIN PAGE
        // =========================

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(p.getProperty("untf"));

        loginPage.enterPassword(p.getProperty("pwtf"));

        loginPage.clickLogin();


        // =========================
        // RECRUITMENT PAGE
        // =========================

        RecruitmentPage recruitmentPage =
                new RecruitmentPage(driver);

        recruitmentPage.clickRecruitment();

        recruitmentPage.clickAdd();


        // =========================
        // ADD CANDIDATE PAGE
        // =========================

        AddCandidatePage addCandidatePage =
                new AddCandidatePage(driver);

        addCandidatePage.enterFirstName(
                p.getProperty("firstname")
        );

        addCandidatePage.enterMiddleName(
                p.getProperty("middlename")
        );

        addCandidatePage.enterLastName(
                p.getProperty("lastname")
        );

        addCandidatePage.selectVacancy();

        addCandidatePage.enterEmail(
                p.getProperty("email")
        );

        addCandidatePage.enterMobile(
                p.getProperty("mobile")
        );

        addCandidatePage.uploadFile(
                p.getProperty("file")
        );

        addCandidatePage.enterApplicationDate(
                p.getProperty("applicationDate")
        );


        // SAVE

        addCandidatePage.clickSave();


        // =========================
        // CANDIDATES PAGE
        // =========================

        CandidatesPage candidatesPage =
                new CandidatesPage(driver);

        candidatesPage.clickCandidates();

        candidatesPage.selectJobTitle();

        candidatesPage.selectVacancy();

        candidatesPage.selectHiringManager();

        candidatesPage.selectStatus();

        candidatesPage.enterCandidateName(
                p.getProperty("candidateName")
        );

        candidatesPage.enterFromDate(
                p.getProperty("fromDate")
        );

        candidatesPage.clickSearch();


        // =========================
        // VERIFY
        // =========================

        candidatesPage.verifyCandidate(
                p.getProperty("candidateName")
        );


        // =========================
        // LOGOUT
        // =========================

        HomePage homePage = new HomePage(driver);

        homePage.clickUserDropdown();

        homePage.clickLogout();


        // Close browser

        driver.quit();
    }
}