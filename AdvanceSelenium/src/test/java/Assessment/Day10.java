package Assessment;


import org.testng.annotations.Test;

import baseClassUtility.SauceDemoBaseClass;
import pomUtilities.SauceCartPOM;
import pomUtilities.SauceCheckoutPOM;
import pomUtilities.SauceProductsPOM;


public class Day10  extends SauceDemoBaseClass{
	@Test
    public void loginTest()  {

		System.out.println("login----------- ");
       
    }
    @Test(dependsOnMethods = "loginTest")
    public void orderPlacementTest() throws Exception  {
    	
    	SauceProductsPOM product = new SauceProductsPOM(driver);
        product.verifyProductsPage();
        product.addBackpackToCart();
        product.getCartCount();
        product.clickCart();
        
        
        SauceCartPOM cart = new SauceCartPOM(driver);
        cart.verifyBackpack();
        cart.clickCheckout();  
        
        SauceCheckoutPOM checkout = new SauceCheckoutPOM(driver);
        String firstName = checkout.getExcelData(1, 0);
        String lastName = checkout.getExcelData(1, 1);
        String postalCode = checkout.getExcelData(1, 2);
        checkout.enterFirstName(firstName);
        checkout.enterLastName(lastName);
        checkout.enterPostalCode(postalCode);
        checkout.clickContinue();
        checkout.verifyCheckoutOverview();
        checkout.clickFinish();
        System.out.println(checkout.getThankYouMessage());	
        System.out.println("OrderPlaced Executed");
    }
}
