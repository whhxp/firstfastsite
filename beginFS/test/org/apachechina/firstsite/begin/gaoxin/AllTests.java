package org.apachechina.firstsite.begin.gaoxin;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("¸ßöÎµÄ²âÊÔ");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
