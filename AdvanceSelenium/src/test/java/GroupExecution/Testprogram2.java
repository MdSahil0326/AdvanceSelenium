package GroupExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseClassUtility.BaseClass;

public class Testprogram2 extends BaseClass {
	@Test(groups = "smoke")
	public void test1(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.instagram.com/");
		System.out.println("instagram launched ");
		driver.quit();
	}
	@Test(groups = "regression")
	public void test2(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://www.amazon.in/");
		System.out.println("amazon launched ");
		driver.quit();
	}
	
	@Test(groups="regression")
	public void test3(){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		driver.get("https://demoapps.qspiders.com/");
		System.out.println("Qspiders demo  launched ");
		driver.quit();
	}

}
