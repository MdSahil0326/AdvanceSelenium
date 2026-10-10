package usingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTNg {
	@Test
	public void Sample() {
		Reporter.log("Hello vinay ",true);
	}
}
