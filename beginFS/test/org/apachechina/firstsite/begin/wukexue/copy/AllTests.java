package org.apachechina.firstsite.begin.wukexue.copy;

import org.apachechina.firstsite.begin.jinlei.MyMessageFormatTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Œ‚ø∆—ßµƒ≤‚ ‘");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatAndOtherTest.class);
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
