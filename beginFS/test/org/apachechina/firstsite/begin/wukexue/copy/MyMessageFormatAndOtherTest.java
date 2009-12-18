package org.apachechina.firstsite.begin.wukexue.copy;

import java.text.MessageFormat;

import org.apachechina.firstsite.begin.jinlei.MyMessageFormat;



import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String execept=MyMessageFormat.format("����{0},����{1}", new Object[]{"���ѧ",28});
		String real=org.apachechina.firstsite.begin.jinlei.MyMessageFormat.format("����{0},����{1}", new Object[]{"���ѧ",28});
		
		
		assertEquals(execept, real);
	}

	

	
	
}
