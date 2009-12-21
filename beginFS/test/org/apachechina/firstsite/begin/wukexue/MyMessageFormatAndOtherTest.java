//@charset "UTF-8";
package org.apachechina.firstsite.begin.wukexue;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatAndOtherTest extends TestCase{
	public void testMessageFormat_format_base()
	{
		
		
		String execept=MessageFormat.format("我是{0},年龄{1}", new Object[]{"吴科学",28});
		String real=org.apachechina.firstsite.begin.jinlei.MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"吴科学",28});
		
		
		assertEquals(execept, real);
	}

	

	
	
}
