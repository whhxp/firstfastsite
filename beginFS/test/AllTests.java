

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"���еĲ���");
		//$JUnit-BEGIN$
		
		suite.addTestSuite(org.apachechina.firstsite.begin.jinlei.MyMessageFormatTest.class);
		suite.addTest(org.apachechina.firstsite.begin.fanle.AllTests.suite());
		suite.addTest(org.apachechina.firstsite.begin.renzhuowei.AllTests.suite());
		suite.addTest(org.apachechina.firstsite.begin.xiaofei.AllTests.suite());
		//$JUnit-END$   
		return suite;
	}

}
