package org.apachechina.firstsite.begin.renzhuowei;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String real=MyMessageFormat.format("����{0},����{1}", new Object[]{"��׿��",21});
		assertEquals("������׿��,����21", real);
	}

	
	public void testMessageFormat_format_other()
	{
		String real=MyMessageFormat.format("����{0},����{1}", new Object[]{"��׿��",21});
		assertEquals("������׿��,����21", real);
	}
	
	
	
}
