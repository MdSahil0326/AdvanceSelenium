package handlingPom;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomUtilities.QSdemo;


public class QSimplementation {
	
	public static void main(String[] args) throws Exception {
		 FileInputStream fis= new FileInputStream("src/test/resources/DDT/Qspiders.properties");
		 Properties p= new Properties();
		 p.load(fis);
		 
		 
		
		 String url = p.getProperty("url");
		 String name = p.getProperty("name");
		 String password = p.getProperty("password");
		 String email = p.getProperty("email");
		 String browser = p.getProperty("browser");
		 
		 WebDriver driver=null;
		 if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		 }
		 
		 
		 QSdemo d=new QSdemo(driver);
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 d.getName(name);
		 d.getEmail(email);
		 d.getPass(password);
		 d.getRegister();
		 
		 
		 
		 
	}
}
