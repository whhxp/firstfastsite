package testjdkapi;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MessageFormatTest extends TestCase{
	public void testMessageFormat_format()
	{
		String real=MessageFormat.format("我是{0},年龄{1}", new Object[]{"倪森",24});
		assertEquals("我是倪森,年龄24", real);
	}
	
	public void testString_format()
	{
		String real=String.format("我是%s,年龄%s","倪森",24);
		assertEquals("我是倪森,年龄24", real);
	}
	
	
	
}
