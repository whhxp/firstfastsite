package org.apachechina.firstsite.begin.renzhuowei;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String execept=MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"任卓了",21});
		String real=org.apachechina.firstsite.begin.jinlei.MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"任卓卫",21});
		
		
		assertEquals(execept, real);
	}

	

	
	
}
