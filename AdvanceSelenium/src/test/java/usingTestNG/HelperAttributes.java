package usingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributes {
	
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void register() {
		Reporter.log("register",true);
	}
	
	@Test(priority = 1,invocationCount = 4,threadPoolSize = 2)
	public void login() {
		WebDriver driver= new ChromeDriver();
		Reporter.log("Login",true);
	}
	
	@Test(priority = 3,invocationCount = 0)
	public void wishlist() {
		Reporter.log("wishlist",true);
	}
	
	@Test(priority = 4,enabled = false)
	public void addToCart() {
		Reporter.log("AddtoCart",true);
	}
	
	
	
}
