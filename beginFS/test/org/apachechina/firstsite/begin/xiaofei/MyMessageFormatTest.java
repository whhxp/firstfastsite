package org.apachechina.firstsite.begin.xiaofei;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		String real=MyMessageFormat.format("����{0},����{1}", new Object[]{"��ɭ",24});
		assertEquals("������ɭ,����24", real);
	}

	
	public void testMessageFormat_format_other()
	{
		String real=MyMessageFormat.format("����{0},����{1}", new Object[]{"jinlei",25});
		assertEquals("����jinlei,����25", real);
	}
	
	
	
}
