package org.apachechina.firstsite.begin.fanle;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String execept=MyMessageFormat.format("����{0},����{1}", new Object[]{"��ɭ",24});
		String real=org.apachechina.firstsite.begin.jinlei.MyMessageFormat.format("����{0},����{1}", new Object[]{"��ɭ",24});
		
		
		assertEquals(execept, real);
	}

	

	
	
}
