package keywordframework;

public class SauceDemoExecution {
	SauceDemoImplementation k= new SauceDemoImplementation();
	
	public void executors(String keyword) {

        if (keyword.equals("LAUNCH_BROWSER")) {
            k.launchBrowser();
        }

        else if (keyword.equals("OPEN_URL")) {
            k.openurl();
        }

        else if (keyword.equals("USER_LOGIN")) {
            k.untf();
        }

        else if (keyword.equals("PASSWORD")) {
            k.pwtf();
        }
        
        else if(keyword.equals("LOGIN")) {
        	k.login();
        }

        else if (keyword.equals("CLOSE_BROWSER")) {
            k.closeBrowser();
        }
        
    }
}
