package usingTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configAnnotations {
	@BeforeSuite
	public void Bs() {
		System.out.println("Open the Database Connectivity");
	}
	@AfterSuite
	public void As() {
		System.out.println("Close - DataBase connectivity");
	}
	
	
	@BeforeTest
	public void BT() {
		System.out.println("Pre-Conditions");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("post-Conditions");
	}
	
	
	@BeforeClass
	public void BC() {
		System.out.println("Launch the browser ");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("Close the browser");
		
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Login executed ");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("Logout Executed ");
	}
	
	@Test
	public void  demo() {
		System.out.println("Open world ");
		
	}

}
