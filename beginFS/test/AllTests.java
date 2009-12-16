

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"ËùÓĞµÄ²âÊÔ");
		//$JUnit-BEGIN$
		suite.addTestSuite(org.apachechina.firstsite.begin.jinlei.MyMessageFormatTest.class);
		suite.addTest(org.apachechina.firstsite.begin.fanle.AllTests.suite());
		//$JUnit-END$
		return suite;
	}

}
