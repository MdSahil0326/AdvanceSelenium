package handlingPom;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomUtilities.DSWebpage;

public class PomImplemetation {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DSWebpage j= new DSWebpage(driver);
		
		j.getStf("Computer");
		j.getSbutton();
		j.getRegister();
		j.getfn("Praveen");
		
		
		
				
	}

}
