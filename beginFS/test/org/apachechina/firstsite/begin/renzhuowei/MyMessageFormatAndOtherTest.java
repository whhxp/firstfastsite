package org.apachechina.firstsite.begin.renzhuowei;
import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String execept=MyMessageFormat.format("����{0},����{1}", new Object[]{"�찡",24});
		String real=org.apachechina.firstsite.begin.jinlei.MyMessageFormat.format("����{0},����{1}", new Object[]{"�찡",24});
		
		
		assertEquals(execept, real);
	}

	

	
	
}
