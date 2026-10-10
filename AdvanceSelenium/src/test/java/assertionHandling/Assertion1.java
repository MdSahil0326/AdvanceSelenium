package assertionHandling;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion1 {
	@Test
	public void test() {

	    // Assert.assertEquals
	    // Assert.assertEquals();
	    // Assert.assertEquals("abc", "abc");
	    //Assert.assertEquals("abc", "def");
	    // Assert.assertEquals(123, 123);

	    // AssertNotEqual
	    // Assert.assertNotEquals("abc", "abc");//fail
	    // Assert.assertNotEquals("abc", "123");//pass

	    // AssertTrue
	    // Assert.assertTrue(true);//pass
	    // Assert.assertTrue(1 == 1);//pass
	    // Assert.assertTrue(1 == 2);//fail

	    // AssertFalse
	    // Assert.assertFalse(true);//fail
	    // Assert.assertFalse(false);//pass
	    // Assert.assertFalse(1 == 2);//pass

	    // AssertNull
	    String username = null;
	    Assert.assertNull(username);

	    // AssertNotNull
	    String username1 = "abc";
	    Assert.assertNotNull(username1);
	}

}
