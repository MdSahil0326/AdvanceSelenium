package baseClassUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pomUtilities.SauceLogin;


public class SauceDemoBaseClass {
	protected WebDriver driver = null;
	
	 @BeforeSuite
		public void Bs() {
			System.out.println("establish database connectivity");
		}
		@AfterSuite
		public void As() {
			System.out.println("close database connectivity");
		}
		@BeforeTest
		public void Bt() {
			System.out.println("pre conditions");
		}
		
		@BeforeClass
		public void Bc() throws IOException {
			
			 FileInputStream fis= new FileInputStream("src/test/resources/DDT/SauceDemo.properties");
			 Properties p= new Properties();
			 p.load(fis);
			 String browser = p.getProperty("browser");
			 if (browser.equals("chrome")) {
		        	ChromeOptions options = new ChromeOptions();
		            options.addArguments("--incognito");
		            driver = new ChromeDriver(options);
		            driver.manage().window().maximize();
		            }}
		
		@BeforeMethod
		public void Bm() throws Exception{
			
			SauceLogin s= new SauceLogin(driver);
			//load the property file 
			FileInputStream fis= new FileInputStream("src/test/resources/DDT/SauceDemo.properties");
			 Properties p= new Properties();
			 p.load(fis);
			 //get the url using the property file 
			driver.get(p.getProperty("url"));
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 s.getusern(p.getProperty("name"));
			 s.getPwtf(p.getProperty("password"));
			 s.getLogin();
			System.out.println("login done");   
		}	
		@AfterMethod
		public void Am() {
			System.out.println("logout executed");
		}
		@AfterClass
		public void Ac() throws InterruptedException{
			Thread.sleep(2000);
			driver.quit();
			System.out.println("close browser");
		}
		@AfterTest
		public void At() {
			System.out.println("post conditions");
		}
		
}

