package org.apachechina.firstsite.begin.renzhuowei;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String real=MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"任卓卫",21});
		assertEquals("我是任卓卫,年龄21", real);
	}

	
	public void testMessageFormat_format_other()
	{
		String real=MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"任卓卫",21});
		assertEquals("我是任卓卫,年龄21", real);
	}
	
	
	
}
