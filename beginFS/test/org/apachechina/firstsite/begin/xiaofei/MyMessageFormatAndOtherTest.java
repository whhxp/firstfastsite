package org.apachechina.firstsite.begin.xiaofei;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String execept=MyMessageFormat.format("����{0},����{1}", new Object[]{"������",21});
		String real=org.apachechina.firstsite.begin.xiaofei.MyMessageFormat.format("����{0},����{1}", new Object[]{"������",21});
		
		
		assertEquals(execept, real);
	}

}
