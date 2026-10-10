package keywordframeworkImplementation;

import keywordframework.KeywordExecution;

public class Keywords {
	public static void main(String[] args) {

			KeywordExecution e= new KeywordExecution();

			e.executors("LAUNCH_BROWSER");
			e.executors("OPEN_URL");
			e.executors("SEARCH_TF");
			e.executors("SEARCH_BUTTON");
			e.executors("CLOSE_BROWSER");
			}
}
