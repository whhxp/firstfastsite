//@charset "UTF-8";
package org.apachechina.firstsite.begin.jinlei;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("���׵Ĳ���");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite;
	}

}
