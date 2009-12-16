package org.apachechina.firstsite.begin.renzhuowei;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"ÈÎ×¿ÎÀµÄ²âÊÔ");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatAndOtherTest.class);
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
