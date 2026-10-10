package GroupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;

public class Testprogram1 extends BaseClass{
	@Test(groups = "smoke")
	public void test1(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.saucedemo.com/");
		System.out.println("saucedemo launched ");
		driver.quit();
	}
	@Test(groups = "regression")
	public void test2(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://in.bookmyshow.com/");
		System.out.println("bookmyshow launched ");
		driver.quit();
	}
	
	@Test(groups="regression")
	public void test3(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.threads.com/");
		System.out.println("theads launched ");
		driver.quit();
	}
}
