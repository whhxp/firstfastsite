//@charset "UTF-8";
package org.apachechina.firstsite.begin.wukexue;

import org.apachechina.firstsite.begin.jinlei.MyMessageFormatTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"吴科学");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatAndOtherTest.class);
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
