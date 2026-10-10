package keywordframeworkImplementation;

import keywordframework.SauceDemoExecution;

public class SauceDemo {
	public static void main(String[] args) throws InterruptedException {

		SauceDemoExecution e= new SauceDemoExecution();

		e.executors("LAUNCH_BROWSER");
		e.executors("OPEN_URL");
		e.executors("USER_LOGIN");
		e.executors("PASSWORD");
		e.executors("LOGIN");
		Thread.sleep(3000);
		e.executors("CLOSE_BROWSER");
		}
	
}

