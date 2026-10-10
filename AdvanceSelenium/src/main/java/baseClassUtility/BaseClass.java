package baseClassUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	 WebDriver driver = null;
	 @BeforeSuite(groups = {"smoke","regression"})
		public void Bs() {
			System.out.println("establish database connectivity");
		}
		@AfterSuite(groups = {"smoke","regression"})
		public void As() {
			System.out.println("close database connectivity");
		}
		@BeforeTest(groups = {"smoke","regression"})
		public void Bt() {
			System.out.println("pre conditions");
		}
		
		@BeforeClass(groups = {"smoke","regression"})
		public void Bc() {
			driver = new ChromeDriver();
			System.out.println("Launch the browser");
		}
		
		@BeforeMethod(groups = {"smoke","regression"})
		public void Bm() throws Exception{
			driver.get("Https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			System.out.println("login done");
		}
		@AfterMethod(groups = {"smoke","regression"})
		public void Am() {
			System.out.println("logout executed");
		}
		@AfterClass(groups = {"smoke","regression"})
		public void Ac() {
			driver.quit();
			System.out.println("close browser");
		}
		@AfterTest(groups = {"smoke","regression"})
		public void At() {
			System.out.println("post conditions");
		}
}