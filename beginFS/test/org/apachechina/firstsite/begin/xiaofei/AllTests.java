package org.apachechina.firstsite.begin.xiaofei;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"ÍõÁú·ÉµÄ²âÊÔ");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatTest.class);
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
