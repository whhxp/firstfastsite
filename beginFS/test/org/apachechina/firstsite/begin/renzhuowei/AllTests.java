//@charset "UTF-8";
package org.apachechina.firstsite.begin.renzhuowei;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"任卓卫的测试");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyMessageFormatAndOtherTest.class);
		suite.addTestSuite(MyMessageFormatTest.class);
		//$JUnit-END$
		return suite; 
	}

}