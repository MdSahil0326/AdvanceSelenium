package usingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExecution {

	@Test()
	public void register() {
		Reporter.log("register",true);
	}
	
	@Test()
	public void login() {
		Reporter.log("Login",true);
	}
	
	@Test()
	public void wishlist() {
		Reporter.log("wishlist",true);
	}
	
	@Test()
	public void addToCart() {
		Reporter.log("AddtoCart",true);
	}
	

}
