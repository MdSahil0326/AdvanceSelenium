package assertionHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TaskSaucedemo {
	@Test
	public void asserts() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("Https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		System.out.println("Executed");
		
		WebElement text = driver.findElement(By.cssSelector("[data-test='title']"));
		Assert.assertEquals(text.getText(),"Products");
		System.out.println("Executed");
		
		
		boolean cart = driver.findElement(By.cssSelector("[data-test='shopping-cart-link']")).isDisplayed();
		Assert.assertTrue(cart);
		System.out.println("Executed");
		
//     driver.quit();
		
		
	}

}

