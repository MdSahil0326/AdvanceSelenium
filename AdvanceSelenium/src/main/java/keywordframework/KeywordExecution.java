package keywordframework;
	public class KeywordExecution {

	    KeywordImplementation k = new KeywordImplementation();

	    public void executors(String keyword) {

	        if (keyword.equals("LAUNCH_BROWSER")) {
	            k.launchBrowser();
	        }

	        else if (keyword.equals("OPEN_URL")) {
	            k.openurl();
	        }

	        else if (keyword.equals("SEARCH_TF")) {
	            k.searchtf();
	        }

	        else if (keyword.equals("SEARCH_BUTTON")) {
	            k.searchbutton();
	        }

	        else if (keyword.equals("CLOSE_BROWSER")) {
	            k.closeBrowser();
	        }
	    }
	}